/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

import Entidad.Persona;

/**
 *
 * @author USER
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Utilizando el constructor vacio
       // Persona primeraPersona = new Persona();
        
        // Utilizando constructor por parametro
        Persona segundaPersona = new Persona ("Mariano", 29, "Colombia", "masculino");
       segundaPersona.setNombre("Laura");
       segundaPersona.setEdad(54);
       segundaPersona.setPais("Argentina");
       segundaPersona.setSexo("Femenino");
       
      
           System.out.println(segundaPersona.toString());
    }

    
}
