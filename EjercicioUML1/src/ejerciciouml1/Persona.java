/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouml1;

/**
 *clase persona
 * @author madrid
 */
public class Persona 
{
   protected String nombre;
   protected int edad;
    
    public Persona(String nombre,int edad)
    {
        this.nombre=nombre;
        this.edad=edad;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
       
    /**
     *muestra por pantalla
     */
    public void mostrar()
    {System.out.println("nombre " + this.nombre + " y edad " +this.edad);
        
    }
    
}
