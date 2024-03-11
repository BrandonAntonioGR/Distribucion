/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.entity;

public class Asignacion {
    String agente;
    String clienteNew;
    String clienteOld;

    public Asignacion() {
    }
    
    public Asignacion(String agente, String clienteNew, String clienteOld) {
        this.agente = agente;
        this.clienteNew = clienteNew;
        this.clienteOld = clienteOld;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getClienteNew() {
        return clienteNew;
    }

    public void setClienteNew(String clienteNew) {
        this.clienteNew = clienteNew;
    }

    public String getClienteOld() {
        return clienteOld;
    }

    public void setClienteOld(String clienteOld) {
        this.clienteOld = clienteOld;
    }
    
    
}
