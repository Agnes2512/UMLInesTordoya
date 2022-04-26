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

    public class Cliente extends Persona
    {
      private  String telefonoContacto;
      private ArrayList<Empresa> proveedores;
        
      public Cliente (String nombre,int edad,String telefono)
      {
          super(nombre,edad);
          this.telefonoContacto=telefono;
      }  
      
      public void mostrar()
      {
          System.out.println("Telefono : " + this.telefonoContacto );
      }

    /**
     * @return the telefonoContacto
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * @param telefonoContacto the telefonoContacto to set
     */
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
    public void addProveedor(Empresa proveedores)
    {
        
    }
    
    public void eliminarProveedor (Empresa proveedores)
    {
    }
    
    
    
    }