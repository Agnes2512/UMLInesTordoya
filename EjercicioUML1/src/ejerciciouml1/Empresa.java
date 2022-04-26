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
public class Empresa {
    private String nombre; 
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;

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
    
    
    public void addCliente(Cliente nuevocliente)
    {
        
    }
    public void contratar(Empleado empleado)
    {
        
    }
    
    public void eliminarCliente (Cliente cliente)
    {
    }
    
    public void despedir(Empleado empleado)
    {
    }
    
    
}
