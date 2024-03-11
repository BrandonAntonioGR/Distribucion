/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.entity;

/**
 *
 * @author Brandon Garduño
 */
public class Distribucion {
    private String tel;
    private String nombre;
    private String agente;
    private String contrato;
    private int dpd;
    private String tipoCliente;
    private String adeudo;
    private int promesas;
    private String concatenado;
    private String algoritmo;

    public Distribucion() {
    }

    public Distribucion(String tel, String nombre, String agente, String contrato, int dpd, String tipoCliente, String adeudo, int promesas, String concatenado, String algoritmo) {
        this.tel = tel;
        this.nombre = nombre;
        this.agente = agente;
        this.contrato = contrato;
        this.dpd = dpd;
        this.tipoCliente = tipoCliente;
        this.adeudo = adeudo;
        this.promesas = promesas;
        this.concatenado = concatenado;
        this.algoritmo = algoritmo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getDpd() {
        return dpd;
    }

    public void setDpd(int dpd) {
        this.dpd = dpd;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(String adeudo) {
        this.adeudo = adeudo;
    }

    public int getPromesas() {
        return promesas;
    }

    public void setPromesas(int promesas) {
        this.promesas = promesas;
    }

    public String getConcatenado() {
        return concatenado;
    }

    public void setConcatenado(String concatenado) {
        this.concatenado = concatenado;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }    
}
