/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.model;

import com.digitalfinance.DAO.entity.Asignacion;
import com.digitalfinance.DAO.entity.Distribucion;
import com.digitalfinance.DAO.entity.Dpd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDistribucion {
    public static ArrayList<Distribucion> consultaContrato(String contrato){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT TOP 1 \n" +
                "	TEL\n" +
                "	,NCOMPLETO\n" +
                "	,NOMBRE\n" +
                "	,Agente\n" +
                "	,CONTRATO\n" +
                "       ,DPD  \n" +
                "       ,Tipo_Cliente\n" +
                "	,Adeudo\n" +
                "       ,PROMESAS  \n" +
                "	,CONCAT(NOMBRE,'|',Agente,'|',CONTRATO) AS VARIABLES  \n" +
                "	,ALGORITMO\n" +
                "     FROM [DC REPORT].[dbo].[DC_HIS_ASIG]\n" +
                "     WHERE CONTRATO='"+contrato+"' and CONVERT(DATE,[Creation_Day])=CONVERT(DATE,GETDATE())");
            ResultSet rs=ps.executeQuery();
            ArrayList<Distribucion> lista=new ArrayList();
            while(rs.next()){
                Distribucion asignacion=new Distribucion();
                asignacion.setTel(rs.getString("TEL"));
                asignacion.setNombre(rs.getString("NCOMPLETO"));
                asignacion.setAgente(rs.getString("Agente"));
                asignacion.setContrato(rs.getString("CONTRATO"));
                asignacion.setDpd(Integer.parseInt(rs.getString("DPD")));
                asignacion.setTipoCliente(rs.getString("Tipo_Cliente"));
                asignacion.setAdeudo(rs.getString("Adeudo"));
                asignacion.setPromesas(Integer.parseInt(rs.getString("PROMESAS")));
                asignacion.setConcatenado(rs.getString("VARIABLES"));
                asignacion.setAlgoritmo(rs.getString("ALGORITMO"));
                lista.add(asignacion);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            return null;
        }
        
    }
    public static ArrayList<Distribucion> consultaTelefono(String telefono){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();
            ps=con.prepareStatement("SELECT TOP 1 \n" +
                "	TEL\n" +
                "	,NCOMPLETO\n" +
                "	,NOMBRE\n" +
                "	,Agente\n" +
                "	,CONTRATO\n" +
                "    ,DPD  \n" +
                "    ,Tipo_Cliente\n" +
                "	,Adeudo\n" +
                "    ,PROMESAS  \n" +
                "	,CONCAT(NOMBRE,'|',Agente,'|',CONTRATO) AS VARIABLES  \n" +
                "	,ALGORITMO\n" +
                "  FROM [DC REPORT].[dbo].[DC_HIS_ASIG]\n" +
                "  where TEL='"+telefono+"' and CONVERT(DATE,[Creation_Day])=CONVERT(DATE,GETDATE())");
            ResultSet rs=ps.executeQuery();
            ArrayList<Distribucion> lista=new ArrayList();
            while(rs.next()){
                Distribucion asignacion=new Distribucion();
                asignacion.setTel(rs.getString("TEL"));
                asignacion.setNombre(rs.getString("NCOMPLETO"));
                asignacion.setAgente(rs.getString("Agente"));
                asignacion.setContrato(rs.getString("CONTRATO"));
                asignacion.setDpd(Integer.parseInt(rs.getString("DPD")));
                asignacion.setTipoCliente(rs.getString("Tipo_Cliente"));
                asignacion.setAdeudo(rs.getString("Adeudo"));
                asignacion.setPromesas(Integer.parseInt(rs.getString("PROMESAS")));
                asignacion.setConcatenado(rs.getString("VARIABLES"));
                asignacion.setAlgoritmo(rs.getString("ALGORITMO"));
                lista.add(asignacion);
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
