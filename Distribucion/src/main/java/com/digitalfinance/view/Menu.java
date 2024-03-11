/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.digitalfinance.view;

import com.digitalfinance.controller.ControllerPantallas;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 *
 * @author Brandon Garduño
 */
public class Menu extends javax.swing.JFrame {
    ControllerPantallas cp =new ControllerPantallas();
    public Menu() {
        initComponents();
        txtAsignaciones.setHorizontalAlignment(SwingConstants.CENTER);
        txtDistribuciones.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelAsignaciones = new javax.swing.JPanel();
        txtAsignaciones = new javax.swing.JLabel();
        panelDistribuciones = new javax.swing.JPanel();
        txtDistribuciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAsignaciones.setBackground(new java.awt.Color(0, 0, 60));
        panelAsignaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsignaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtAsignaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtAsignaciones.setText("Asignaciones");
        txtAsignaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAsignacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAsignacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAsignacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAsignacionesLayout = new javax.swing.GroupLayout(panelAsignaciones);
        panelAsignaciones.setLayout(panelAsignacionesLayout);
        panelAsignacionesLayout.setHorizontalGroup(
            panelAsignacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelAsignacionesLayout.setVerticalGroup(
            panelAsignacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelAsignaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 50));

        panelDistribuciones.setBackground(new java.awt.Color(0, 0, 60));
        panelDistribuciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDistribuciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        txtDistribuciones.setForeground(new java.awt.Color(255, 255, 255));
        txtDistribuciones.setText("Distribuciones");
        txtDistribuciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDistribuciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDistribucionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDistribucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDistribucionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDistribucionesLayout = new javax.swing.GroupLayout(panelDistribuciones);
        panelDistribuciones.setLayout(panelDistribucionesLayout);
        panelDistribucionesLayout.setHorizontalGroup(
            panelDistribucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDistribuciones, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        panelDistribucionesLayout.setVerticalGroup(
            panelDistribucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDistribuciones, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelDistribuciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 196, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAsignacionesMouseClicked
        cp.Asignacion();
        this.dispose();
    }//GEN-LAST:event_txtAsignacionesMouseClicked

    private void txtDistribucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDistribucionesMouseClicked
        cp.Distribucion();
        this.dispose();
    }//GEN-LAST:event_txtDistribucionesMouseClicked

    private void txtAsignacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAsignacionesMouseEntered
        panelAsignaciones.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtAsignacionesMouseEntered

    private void txtAsignacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAsignacionesMouseExited
        panelAsignaciones.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtAsignacionesMouseExited

    private void txtDistribucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDistribucionesMouseEntered
        panelDistribuciones.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtDistribucionesMouseEntered

    private void txtDistribucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDistribucionesMouseExited
        panelDistribuciones.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtDistribucionesMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAsignaciones;
    private javax.swing.JPanel panelDistribuciones;
    private javax.swing.JLabel txtAsignaciones;
    private javax.swing.JLabel txtDistribuciones;
    // End of variables declaration//GEN-END:variables
}
