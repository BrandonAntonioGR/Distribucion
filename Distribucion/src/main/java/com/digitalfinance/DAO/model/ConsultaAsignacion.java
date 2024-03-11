/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.model;

import com.digitalfinance.DAO.entity.Asignacion;
import com.digitalfinance.DAO.entity.Dpd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultaAsignacion {
    public static ArrayList<Asignacion> consultaAsignaciones(int dpd){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT\n" +
                " Agente,\n" +
                " ISNULL([1], 0) AS NEW, \n" +
                " ISNULL([2], 0) AS OLD \n" +
                " 	FROM \n" +
                "	(SELECT Agente,ALGORITMO,COUNT(Total) AS TOTAL \n" +
                "		FROM  \n" +
                "		(\n" +
                "			 select Agente ,CONTRATO,[status],[Creation_Day]\n" +
                " 					,ALGORITMO = CASE \n" +
                " 						WHEN Tipo_Cliente='NEW' THEN 1 \n" +
                " 						WHEN Tipo_Cliente='OLD' THEN 2 \n" +
                "				 END \n" +
                "			   ,Client_Type as Total \n" +
                "			 from [DC REPORT].[dbo].[DC_HIS_ASIG] \n" +
                "			 where  CONVERT(DATE,Creation_Day)=CONVERT(DATE,GETDATE()) and DPD="+dpd+"\n" +
                "			 AND Agente is not null and Agente NOT IN('ARELI','')\n" +
                "		 ) AS T  \n" +
                "		GROUP BY Agente,ALGORITMO,Total\n" +
                "	 ) AS PivotData \n" +
                " PIVOT ( \n" +
                " SUM(TOTAL) \n" +
                " FOR ALGORITMO IN ([1], [2]) \n" +
                " ) AS PivotedTable\n" +
                " ORDER BY Agente");
            ResultSet rs=ps.executeQuery();
            ArrayList<Asignacion> lista=new ArrayList();
            while(rs.next()){
                Asignacion asignacion=new Asignacion();
                asignacion.setAgente(rs.getString("Agente"));
                asignacion.setClienteNew(rs.getString("NEW"));
                asignacion.setClienteOld(rs.getString("OLD"));
                lista.add(asignacion);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            return null;
        }
        
    }
    public static ArrayList<Dpd> listaDpd(){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT DPD\n" +
                "FROM \n" +
                "(select CONVERT(INT ,DPD) AS DPD\n" +
                "from [DC REPORT].[dbo].[DC_HIS_ASIG]\n" +
                "where  CONVERT(DATE,Creation_Day)=CONVERT(DATE,GETDATE()) \n" +
                ") AS T \n" +
                "GROUP BY DPD \n" +
                "ORDER BY DPD ASC");
            ResultSet rs=ps.executeQuery();
            ArrayList<Dpd> lista=new ArrayList();
            while(rs.next()){
                Dpd dpd=new Dpd();
                dpd.setDpd(Integer.parseInt(rs.getString("DPD")));
                lista.add(dpd);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
}
