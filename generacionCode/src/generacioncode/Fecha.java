/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generacioncode;
/**
 *
 * @author Mariana
 */
public class Fecha {
    private int dia ;
    private int mes;
    private int año;

public Fecha (int dia ,int mes,int año){
this.dia=dia;
this.mes=mes;
this.año=año;
}

public int getDia (){
return dia;
}
public int getAño(){
return año;
}
public int getMes(){
return mes;
}
}

