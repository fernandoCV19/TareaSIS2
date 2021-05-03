/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generacioncode;

public class GenerarCodigos {

    
    public static void main(String[] args) {
        Fecha fecha =new Fecha (2,10,00);
        int ci =5308400;
        String nombre="Mariana";
        String apellido="Villarroel";
        String gestion="2021";
        String periodo="2";
        String carrera="informatica";
        mostrar(fecha,nombre,apellido,gestion,periodo,carrera);
    }
    public static String generarCodigo(Fecha fecha, String nombre,String  apellido){
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
    public static void  mostrar(Fecha fecha,String nombre,String apellido,String gestion,String periodo,String carrera){
     
      String mayusculasCarrera=carrera.toUpperCase ();
    System.out.println("CODIGOS DE ACCESO");
    System.out.println("CARRERA: LICENCIATURA EN "+mayusculasCarrera);
    System.out.println("GESTIÓN: "+periodo +"/"+gestion);
    System.out.println("COD. DE ACCESO 1: "+generarCodigo( fecha,  nombre, apellido));
    System.out.println("COD. DE ACCESO 2: "+generarCodigo( fecha,  nombre, apellido));
    System.out.println("COD. DE ACCESO 3: "+generarCodigo( fecha,  nombre, apellido));
    System.out.println("COD. DE ACCESO 4: "+generarCodigo( fecha,  nombre, apellido));
    System.out.println("COD. DE ACCESO 5: "+generarCodigo( fecha,  nombre, apellido));
    }
    
    
}