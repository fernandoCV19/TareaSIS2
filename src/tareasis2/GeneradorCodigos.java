package tareasis2;

import java.awt.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GeneradorCodigos{

    
    private ArrayList<String> listaCodigos;

    public GeneradorCodigos(){
        listaCodigos = new ArrayList();
    }
    
    public ArrayList<String> getListaCodigos (Fecha fecha, String nombre, String apellido){
        for (int i = 0; i < 5; i++) {
            listaCodigos.add(generarCodigo(fecha, nombre, apellido));
        }
        return listaCodigos;
    }
    
    public String generarCodigo(Fecha fecha, String nombre, String apellido) {
        int numero = (int) (Math.random() * (90 - 65 + 1) + 65);
        int numero2 = (int) (Math.random() * (90 - 65 + 1) + 65);
        String mayusculasApellido = apellido.toUpperCase();
        int numeroRamdom = (int) (Math.random() * (apellido.length() - 1 + 1) + 0);
        char primerDigito = mayusculasApellido.charAt(numeroRamdom);
        char caracter1 = (char) numero;
        char caracter2 = (char) numero2;

        int numeroRamdom2 = (int) (Math.random() * (9 - 1 + 1) + 0);
        int dia = fecha.getDia() % 10;
        if (dia + numeroRamdom2 >= 10) {
            dia = dia;
        } else {
            dia = dia + numeroRamdom2;
        }
        String mayusculasNombre = nombre.toUpperCase();
        int numero3 = (int) (Math.random() * (nombre.length() - 1 + 1) + 0);
        char segundoCaracter = mayusculasNombre.charAt(numero3);
        String codigo = primerDigito + "" + caracter1 + "" + segundoCaracter + "" + "" + dia + caracter2;
        return codigo;

    }
}
