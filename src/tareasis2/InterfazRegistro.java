/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasis2;

import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author Alejandro
 */
public class InterfazRegistro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public InterfazRegistro(){

        
        this.setDefaultCloseOperation(InterfazRegistro.EXIT_ON_CLOSE);
        this.setTitle("Ventana con Imagen");
        this.setSize(new Dimension(650,650));        
        this.setLocationRelativeTo(null);
        
        //-----------------------------------------
panel2 = new tareasis2.panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoSis = new javax.swing.JTextField();
        carnetIdentidad = new javax.swing.JTextField();
        carrera = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 1, 1));
        jLabel1.setText("Registrar Estudiante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código SIS:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Carnet de Identidad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Carrera:");

        codigoSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSisActionPerformed(evt);
            }
        });

        carnetIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetIdentidadActionPerformed(evt);
            }
        });

        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel4))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel3))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carnetIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoSis, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel2))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(codigoSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(carnetIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(60, 60, 60))
        );

        getContentPane().add(panel2, java.awt.BorderLayout.CENTER);

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new tareasis2.panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoSis = new javax.swing.JTextField();
        carnetIdentidad = new javax.swing.JTextField();
        carrera = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 1, 1));
        jLabel1.setText("Registrar Estudiante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código SIS:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Carnet de Identidad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Carrera:");

        codigoSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSisActionPerformed(evt);
            }
        });

        carnetIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetIdentidadActionPerformed(evt);
            }
        });

        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel4))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel3))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carnetIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoSis, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel2))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(codigoSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(carnetIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(60, 60, 60))
        );

        getContentPane().add(panel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Desde este boton recibes todos los datos 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String textoCodigoSis=codigoSis.getText();
        String textoCarrera=carrera.getText();
        String textoCarnetIdentidad=carnetIdentidad.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carnetIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnetIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnetIdentidadActionPerformed

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraActionPerformed

    private void codigoSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoSisActionPerformed

    /**
     * @param args the command line arguments
     */      
    /**
     *
     */
    public static void main(String [] args){
        InterfazRegistro frame = new InterfazRegistro();
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carnetIdentidad;
    private javax.swing.JTextField carrera;
    private javax.swing.JTextField codigoSis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private tareasis2.panel panel2;
    // End of variables declaration//GEN-END:variables
}
