/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.view.Asignaciones;
import com.digitalfinance.view.Distribuciones;
import com.digitalfinance.view.Menu;

/**
 *
 * @author Brandon Garduño
 */
public class ControllerPantallas {
    public void Distribucion(){
        Distribuciones d= new Distribuciones();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }
    public void Asignacion(){
        Asignaciones a= new Asignaciones();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }
    public void Menu(){
        Menu m= new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }
}
