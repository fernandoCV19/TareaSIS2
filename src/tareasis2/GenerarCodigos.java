
package tareasis2;
import java.awt.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 


public class GenerarCodigos extends JFrame {
  
     private FlowLayout flow=new FlowLayout();
     private ArrayList<String>listaCodigos  = new  ArrayList() ;
     
    public  void principal() {
        Fecha fecha =new Fecha (2,10,00);
        int ci =5308400;
        String nombre="Mariana";
        String apellido="Villarroel";
        String gestion="2021";
        String periodo="2";
        String carrera="informatica";
        mostrar(fecha,nombre,apellido,gestion,periodo,carrera);
    }
    public  String generarCodigo(Fecha fecha, String nombre,String  apellido){
       int numero = (int)(Math.random()*(90-65+1)+65);
       int numero2 = (int)(Math.random()*(90-65+1)+65);
       String mayusculasApellido=apellido.toUpperCase ();
       int numeroRamdom = (int)(Math.random()*(apellido.length()-1+1)+0);
       char primerDigito=mayusculasApellido.charAt(numeroRamdom);
       char caracter1 = (char)numero; 
       char caracter2 = (char)numero2;
       
       int numeroRamdom2 = (int)(Math.random()*(9-1+1)+0);
       int dia =fecha.getDia()%10;    
       if(dia +numeroRamdom2>=10){
        dia=dia;
        }else{
        dia=dia+numeroRamdom2;
        }
       String mayusculasNombre=nombre.toUpperCase ();
       int numero3 = (int)(Math.random()*(nombre.length()-1+1)+0);
       char segundoCaracter=mayusculasNombre.charAt(numero3);
       String codigo =primerDigito+""+caracter1+""+segundoCaracter+""+""+dia+caracter2;
       return  codigo;     
                                
    
    }
    public  void  mostrar(Fecha fecha,String nombre,String apellido,String gestion,String periodo,String carrera){
     
      String mayusculasCarrera=carrera.toUpperCase ();
        GenerarCodigos codigos=new GenerarCodigos();
        codigos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
        setLayout(flow);
        setTitle("generacion de codigos"); 
        setSize(300,300);        
        setVisible(true); 
        add(new Label("CODIGOS DE ACCESO\n"));
        add(new Label("CARRERA: LICENCIATURA EN "+mayusculasCarrera+"\n"));
        add(new Label("GESTIÓN: "+periodo +"/"+gestion));
        for (int i =1;i<=5;i++){
  
        String codigo=generarCodigo( fecha,  nombre, apellido);
        add(new Label("COD. DE ACCESO "+i+": "+codigo+"\n"));
        listaCodigos.add(codigo);
        }
     
        
    }
     public static void main(String[] args) {
       GenerarCodigos gc= new GenerarCodigos(); 
       gc.principal();
    }

}
    
    
