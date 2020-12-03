/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bd.Conexion;
import negocio.Vehiculo;

/**
 *
 * @author Ricardo
 */
public class JIF_eliminarVehiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIF_eliminarVehiculo
     */
    public JIF_eliminarVehiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxt_chasis = new javax.swing.JTextField();
        jbtn_eliminar = new javax.swing.JToggleButton();

        jLabel1.setText("ELIMINAR VEHICULO POR CHASIS:");

        jtxt_chasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_chasisActionPerformed(evt);
            }
        });

        jbtn_eliminar.setText("ELIMINAR");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jtxt_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jbtn_eliminar)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jbtn_eliminar)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_chasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_chasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_chasisActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        
        try {
             Vehiculo objVehi = new Vehiculo(Integer.parseInt(this.jtxt_chasis.getText()),123,"m","c","t","s","m");

            //Vehiculo objVehi = new Vehiculo(Integer.parseInt(this.jtxt_chasis.getText()),);
            objVehi.cargarChasisVehiculo();
            if(Conexion.buscarChasis){
                System.out.println("ESTE AUTO EXSITE Y FUE ELIMINADO.");
                objVehi.eliminarVehiculo();
            }
            else{
                System.out.println("No PASO NA");
            }
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jbtn_eliminar;
    private javax.swing.JTextField jtxt_chasis;
    // End of variables declaration//GEN-END:variables
}