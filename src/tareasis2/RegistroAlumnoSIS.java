/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasis2;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistroAlumnoSIS extends javax.swing.JPanel {

    private JTextField anioNacimiento;
    private JTextField apellidoMaterno;
    private JTextField apellidoPaterno;
    private JTextField ci;
    private JComboBox<String> ciDepartamento;
    private JComboBox<String> ciudadNacimiento;
    private JTextField diaNacimiento;
    private JComboBox<String> carrera;
    private JTextField mesNacimiento;
    private JTextField primerNombre;
    private JButton registrar;
    private JTextField segundoNombre;
    
    public RegistroAlumnoSIS() {
        iniciarInterfaz();
    }
    
    private void iniciarInterfaz() {

        JLabel linea1 = new JLabel();
        JLabel linea2 = new JLabel();
        this.primerNombre = new JTextField();
        JLabel linea3 = new JLabel();
        this.segundoNombre = new JTextField();
        JLabel linea4 = new JLabel();
        this.ci = new JTextField();
        JLabel linea5 = new JLabel();
        this.anioNacimiento = new JTextField();
        JLabel linea6 = new JLabel();
        this.ciudadNacimiento = new JComboBox<>();
        JLabel linea7 = new JLabel();
        this.ciDepartamento = new JComboBox<>();
        JLabel linea8 = new JLabel();
        JLabel linea9 = new JLabel();
        JLabel linea10 = new JLabel();
        JLabel linea11 = new JLabel();
        this.apellidoMaterno = new JTextField();
        this.diaNacimiento = new JTextField();
        this.mesNacimiento = new JTextField();
        JLabel linea12 = new JLabel();
        this.apellidoPaterno = new JTextField();
        this.carrera = new JComboBox<>();
        this.registrar = new JButton();

        setPreferredSize(new java.awt.Dimension(1300, 800));

        linea1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linea1.setText("REGISTRO DE ALUMNO EN EL SISTEMA WEBSIS");
        linea1.setToolTipText("");
        linea1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        linea2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea2.setText("SEGUNDO NOMBRE:");
        linea2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.primerNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        linea3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea3.setText("PRIMER NOMBRE:");
        linea3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        linea4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea4.setText("CI:");
        linea4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.ci.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        linea5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea5.setText("APELLIDO MATERNO:");
        linea5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.anioNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        linea6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea6.setText("CIUDAD DE NACIMIENTO:");
        linea6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.ciudadNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        this.ciudadNacimiento.setMaximumRowCount(9);
        this.ciudadNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PANDO", "BENI", "SANTA CRUZ", "COCHABAMBA", "SUCRE", "TARIJA", "LA PAZ", "ORURO", "POTOSI" }));

        linea7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea7.setText("APELLIDO PATERNO:");
        linea7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.ciDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CH", "LP", "CB", "OR", "PT", "TJ", "SC", "BE", "PD" }));

        linea8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea8.setText("FECHA NACIMIENTO:");
        linea8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        linea9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea9.setText("DIA:");
        linea9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        linea10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea10.setText("AÑO:");
        linea10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        linea11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea11.setText("MES:");
        linea11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.apellidoMaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        this.diaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        this.mesNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        linea12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        linea12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        linea12.setText("CARRERA:");
        linea12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        this.apellidoPaterno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        this.carrera.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        this.carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LICENCIATURA DIDACTICA MATEMATICA", "LICENCIATURA EN BIOLOGIA", "LICENCIATURA EN DIDACTICA DE LA FISICA", "LICENCIATURA EN FISICA", "LICENCIATURA EN ING. ELECTROMECANICA", "LICENCIATURA EN INGENIERIA CIVIL (NUEVO)", "LICENCIATURA EN INGENIERIA DE ALIMENTOS", "LICENCIATURA EN INGENIERIA DE SISTEMAS", "LICENCIATURA EN INGENIERIA ELECTRICA", "LICENCIATURA EN INGENIERIA ELECTRONICA", "LICENCIATURA EN INGENIERIA INDUSTRIAL", "LICENCIATURA EN INGENIERIA INFORMATICA", "LICENCIATURA EN INGENIERIA MATEMATICA", "LICENCIATURA EN INGENIERIA MECANICA", "LICENCIATURA EN INGENIERIA QUIMICA", "LICENCIATURA EN MATEMATICAS", "LICENCIATURA EN QUIMICA" }));

        this.registrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        this.registrar.setText("REGISTRAR");
        this.registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(linea7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(linea3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(linea2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(linea4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.ci))
                            .addComponent(this.primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(this.apellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.ciDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(linea8)
                                .addGap(26, 26, 26)
                                .addComponent(linea9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(linea5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(this.segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(this.apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(linea12)
                        .addGap(18, 18, 18)
                        .addComponent(this.carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linea6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(this.ciudadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(this.diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(linea11)
                        .addGap(28, 28, 28)
                        .addComponent(this.mesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(linea10)
                        .addGap(18, 18, 18)
                        .addComponent(this.anioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(linea1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(this.registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linea1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea2)
                    .addComponent(linea3)
                    .addComponent(linea6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.ciudadNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea5)
                    .addComponent(linea7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(linea4)
                        .addComponent(this.ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(this.ciDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(linea8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(linea9)
                        .addComponent(linea10)
                        .addComponent(linea11)
                        .addComponent(this.anioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.mesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea12)
                    .addComponent(this.carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(this.registrar)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>                        

    private void registrarActionPerformed(ActionEvent evt) {                                          
        String primerNombre = this.primerNombre.getText();
        String segundoNombre = this.segundoNombre.getText();
        String apellidoPaterno = this.apellidoPaterno.getText();
        String apellidoMaterno = this.apellidoMaterno.getText();
        String ciudadNacimiento = this.ciudadNacimiento.getSelectedItem().toString();
        String ci = this.ci.getText();
        String ciDepartamento = this.ciDepartamento.getSelectedItem().toString();
        int diaNacimiento = Integer.parseInt(this.diaNacimiento.getText());
        int mesNacimiento = Integer.parseInt(this.mesNacimiento.getText());
        int anioNacimiento = Integer.parseInt(this.anioNacimiento.getText());
        String carrera = this.carrera.getSelectedItem().toString();
    }            
}
