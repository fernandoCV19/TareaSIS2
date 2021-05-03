/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasis2;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tareasis2.servicios.EstudianteServicios;

/**
 *
 * @author Windows 10
 */
public class VentanaAgregarDocumentos extends JPanel {

    private JTextField pasaporte;
    private JTextField certNacimiento;
    private JTextField licConducir;
    private JButton anadir;
    private JButton regresar;
    private JFrame ventana;
    private int codSIS;

    public VentanaAgregarDocumentos(JFrame ventana, int codSIS) {
        this.ventana = ventana;
        this.codSIS = codSIS;
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        this.setLayout(null);

        Font font = new Font("Tahoma", 0, 24);

        JLabel titulo = new JLabel("REGISTRO DOCUMENTOS");
        titulo.setBounds(100, 10, 300, 40);
        titulo.setFont(font);

        JLabel pasaporteLabel = new JLabel("Ingrese numero pasaporte:");
        pasaporteLabel.setBounds(10, 80, 300, 40);
        pasaporteLabel.setFont(font);

        pasaporte = new JTextField();
        pasaporte.setBounds(100, 150, 300, 40);
        pasaporte.setFont(font);

        JLabel cerNacimientoLabel = new JLabel("Ingrese numero certificado nacimiento:");
        cerNacimientoLabel.setBounds(10, 220, 480, 40);
        cerNacimientoLabel.setFont(font);

        certNacimiento = new JTextField();
        certNacimiento.setBounds(100, 290, 300, 40);
        certNacimiento.setFont(font);

        JLabel licConducirLabel = new JLabel("Ingrese numero licencia de conducir:");
        licConducirLabel.setBounds(10, 360, 480, 40);
        licConducirLabel.setFont(font);

        licConducir = new JTextField();
        licConducir.setBounds(100, 430, 300, 40);
        licConducir.setFont(font);

        anadir = new JButton("REGISTRAR DATOS");
        anadir.setBounds(100, 500, 300, 40);
        anadir.setFont(font);
        anadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registrar();
            }
        });

        regresar = new JButton("<");
        regresar.setBounds(5, 5, 50, 40);
        regresar.setFont(new Font("Tahoma", 0, 18));
        regresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                InterfazNavegacion interfazRegistro = new InterfazNavegacion();
                ventana.dispose();
            }
        });

        this.add(titulo);
        this.add(pasaporteLabel);
        this.add(pasaporte);
        this.add(cerNacimientoLabel);
        this.add(certNacimiento);
        this.add(licConducirLabel);
        this.add(licConducir);
        this.add(anadir);
        this.add(regresar);
    }

    public void registrar() {
        try {
            //sis,na,pas,lic   setDocumentos
            int nac = 0;
            int pas = 0;
            int licCon = 0;
            
            if (!certNacimiento.getText().equals("")) {
                nac = Integer.parseInt(certNacimiento.getText());
            }
            
            if (!pasaporte.getText().equals("")) {
                pas = Integer.parseInt(pasaporte.getText());
            }
            
            if (!licConducir.getText().equals("")) {
                licCon = Integer.parseInt(licConducir.getText());
            }
            EstudianteServicios es = new EstudianteServicios();
            
            
            if (es.setDocumentos(Conexion.obtener(),codSIS, nac, pas, licCon)) {
                JOptionPane.showMessageDialog(this, "Los documentos fueron registrados");
            } else {
                JOptionPane.showMessageDialog(this, "Los documentos no fueron registrados");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaAgregarDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaAgregarDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
