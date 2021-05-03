/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasis2;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Windows 10
 */
public class VentanaVerificacionSISCodigos extends JPanel {

    private JTextField codigoSIS;
    private JTextField diaNacimiento;
    private JTextField mesNacimiento;
    private JTextField anioNacimiento;
    private JButton ingresar;
    private JButton regresar;
    private JFrame ventana;

    public VentanaVerificacionSISCodigos(JFrame ventana) {
        this.ventana = ventana;
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        this.setLayout(null);

        Font font = new Font("Tahoma", 0, 24);

        JLabel titulo = new JLabel("INGRESO AL SISTEMA");
        titulo.setBounds(100, 10, 250, 40);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        titulo.setFont(font);

        JLabel codigoSISLabel = new JLabel("Ingresar codigo SIS:");
        codigoSISLabel.setBounds(10, 70, 300, 40);
        codigoSISLabel.setFont(font);

        codigoSIS = new JTextField();
        codigoSIS.setBounds(75, 130, 300, 40);
        codigoSIS.setFont(font);

        JLabel diaLabel = new JLabel("Ingresar dia de nacimiento:");
        diaLabel.setBounds(10, 200, 320, 40);
        diaLabel.setFont(font);

        diaNacimiento = new JTextField();
        diaNacimiento.setBounds(340, 200, 80, 40);
        diaNacimiento.setFont(font);

        JLabel mesLabel = new JLabel("Ingresar mes de nacimiento:");
        mesLabel.setBounds(10, 260, 320, 40);
        mesLabel.setFont(font);

        mesNacimiento = new JTextField();
        mesNacimiento.setBounds(340, 260, 80, 40);
        mesNacimiento.setFont(font);

        JLabel anioLabel = new JLabel("Ingresar año de nacimiento:");
        anioLabel.setBounds(10, 320, 320, 40);
        anioLabel.setFont(font);

        anioNacimiento = new JTextField();
        anioNacimiento.setBounds(340, 320, 80, 40);
        anioNacimiento.setFont(font);

        ingresar = new JButton("INGRESAR");
        ingresar.setBounds(100, 400, 250, 40);
        ingresar.setFont(font);
        ingresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                VentanaGeneradorDeCodigos generarCodigos = new VentanaGeneradorDeCodigos();
                ventana.dispose();
            }
        });

        regresar = new JButton("<");
        regresar.setBounds(10, 10, 50, 40);
        regresar.setFont(new Font("Tahoma", 0, 18));
        regresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                InterfazNavegacion interfazNavegacion = new InterfazNavegacion();
                ventana.dispose();
            }
        });

        this.add(titulo);
        this.add(codigoSISLabel);
        this.add(codigoSIS);
        this.add(diaLabel);
        this.add(diaNacimiento);
        this.add(mesLabel);
        this.add(mesNacimiento);
        this.add(anioLabel);
        this.add(anioNacimiento);
        this.add(ingresar);
        this.add(regresar);
    }
}
