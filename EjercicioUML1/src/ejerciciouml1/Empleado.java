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
public class Empleado extends Persona{
    private int sueldoBruto;
    private Empresa empresa;
     private ArrayList<Directivo> jefes;

    /**
     * @return the sueldoBruto
     */
    public int getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * @param sueldoBruto the sueldoBruto to set
     */
    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
public Empleado(String nombre,int edad, int sueldoBruto,Empresa empresa)
{ super (nombre,edad);
this.sueldoBruto=sueldoBruto;
this.empresa=empresa;
}
public void addjefe(Directivo directivo)
{
    this.jefes.add(directivo);
}
public void removejefe(Directivo directivo)
{
    this.jefes.remove(directivo);
}
}

