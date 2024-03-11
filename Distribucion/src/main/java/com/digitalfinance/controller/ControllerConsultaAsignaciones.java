/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.DAO.entity.Asignacion;
import com.digitalfinance.DAO.entity.Dpd;
import com.digitalfinance.DAO.model.ConsultaAsignacion;
import java.util.ArrayList;


public class ControllerConsultaAsignaciones {
    public ArrayList<Asignacion> consultaContrato(int dpd){
        return  ConsultaAsignacion.consultaAsignaciones(dpd);
    }
    public ArrayList<Dpd> consultaListaDpd(){
        return  ConsultaAsignacion.listaDpd();
    }
}
