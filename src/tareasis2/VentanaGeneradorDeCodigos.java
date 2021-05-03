/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasis2;

import java.awt.Dimension;
import sun.awt.AWTAccessor;
import java.util.*;
import tareasis2.models.Codigo;
/**
 *
 * @author Mariana
 */
public class VentanaGeneradorDeCodigos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGeneradorDeCodigos
     */
    public VentanaGeneradorDeCodigos(Codigo codigo) {
        
        this.setDefaultCloseOperation(InterfazRegistro.EXIT_ON_CLOSE);
        this.setTitle("Ventana con Imagen");
        this.setSize(new Dimension(650, 650));
        this.setLocationRelativeTo(null);
 
        GeneradorCodigos gc = new GeneradorCodigos();
        String cod1 = codigo.getCodigo1();
        String cod2 = codigo.getCodigo2();
        String cod3 = codigo.getCodigo3();
        String cod4 = codigo.getCodigo4();
        String cod5 = codigo.getCodigo5();
  //------------------------------------------------------------------------------      


        panel1 = new tareasis2.panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCod2Label = new javax.swing.JLabel();
        jCod3Label = new javax.swing.JLabel();
        jCod5Label = new javax.swing.JLabel();
        jCod4Label = new javax.swing.JLabel();
        jCod1Label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CODIGOS DE ACCESO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("COD. DE ACCESO 1  : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("COD. DE ACCESO 2  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("COD. DE ACCESO 3  : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("COD. DE ACCESO 4  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("COD. DE ACCESO 5  :");

        jCod2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod2Label.setText(cod2);

        jCod3Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod3Label.setText(cod3);

        jCod5Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod5Label.setText(cod4);

        jCod4Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod4Label.setText(cod5);

        jCod1Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod1Label.setText(cod1);

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCod5Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod3Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod4Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod2Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod1Label, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(94, 94, 94)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCod1Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jCod2Label)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCod3Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCod4Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCod5Label))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
        this.setVisible(true);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new tareasis2.panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCod2Label = new javax.swing.JLabel();
        jCod3Label = new javax.swing.JLabel();
        jCod5Label = new javax.swing.JLabel();
        jCod4Label = new javax.swing.JLabel();
        jCod1Label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CODIGOS DE ACCESO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("COD. DE ACCESO 1  : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("COD. DE ACCESO 2  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("COD. DE ACCESO 3  : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("COD. DE ACCESO 4  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("COD. DE ACCESO 5  :");

        jCod2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod2Label.setText("jLabel10");

        jCod3Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod3Label.setText("jLabel11");

        jCod5Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod5Label.setText("jLabel13");

        jCod4Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod4Label.setText("jLabel12");

        jCod1Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCod1Label.setText("jLabel9");

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCod5Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod3Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod4Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod2Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCod1Label, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(94, 94, 94)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCod1Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jCod2Label)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCod3Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCod4Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCod5Label))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfazNavegacion nav=new InterfazNavegacion();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCod1Label;
    private javax.swing.JLabel jCod2Label;
    private javax.swing.JLabel jCod3Label;
    private javax.swing.JLabel jCod4Label;
    private javax.swing.JLabel jCod5Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private tareasis2.panel panel1;
    // End of variables declaration//GEN-END:variables
}
