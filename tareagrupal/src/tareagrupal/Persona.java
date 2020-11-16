/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareagrupal;

/**
 *
 * @author vmbv2
 */
public abstract class Persona {
    
    abstract int getDNI();
    private String nombre;    
    private int edad;
    private String especialidad;
    private String nacionalidad;
    

    // Constructor
    public Persona(){

    }


    // set y get

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }


    public void establecerEdad(int edad){
        this.edad = edad;
    }

    public int obtenerEdad(){
        return this.edad;
    }


    public void establecerEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public String obtenerEspecialidad(){
        return this.especialidad;
    }


    public void establecerNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String obtenerNacionalidad(){
        return this.nacionalidad;
    }



    public void imprimirInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

}