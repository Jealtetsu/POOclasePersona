/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USER
 */
// Atributos
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String pais;
    
    // Constructor por defecto
    
   // public Persona(){
   // }
    
    //Constructor con parametros
    public Persona(String nombre, int edad, String sexo, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo; 
        this.pais = pais;
        
      }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", pais=" + pais + '}';
    }


    
    
    
}

