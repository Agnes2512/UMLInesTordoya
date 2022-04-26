/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouml1;

import java.util.ArrayList;

/**
 *
 * @author madrid
 */
public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> subordinados;



public Directivo(String nombre,int edad,int sueldoBruto,String categoria ,Empresa empresa){
super(nombre,edad,sueldoBruto,empresa);
this.categoria = categoria;

}
public void addEmpleado (Empleado subordinado)
{
    this.subordinados.add(subordinado);
}
public void quitarEmpleado(Empleado subordinado)
{
    this.subordinados.remove(subordinado);
}
}
