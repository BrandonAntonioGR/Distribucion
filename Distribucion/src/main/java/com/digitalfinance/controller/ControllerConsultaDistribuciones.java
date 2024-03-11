/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.DAO.entity.Distribucion;
import com.digitalfinance.DAO.model.ConsultaDistribucion;
import java.util.ArrayList;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerConsultaDistribuciones {
    public ArrayList<Distribucion> consultaContrato(String contrato){
        return  ConsultaDistribucion.consultaContrato(contrato);
    }
    public ArrayList<Distribucion> consultaTelefono(String telefono){
        return  ConsultaDistribucion.consultaTelefono(telefono);
    }
}
