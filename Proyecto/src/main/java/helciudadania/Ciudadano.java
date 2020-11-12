/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helciudadania;

/**
 *
 * @author Nahun Salez
 */
public class Ciudadano {
    //declaracion de los datos
    private String Nombre;
    private int Edad;
    private int Experiencia;
    
    public Ciudadano(String nombre, int edad){
       this.Nombre=nombre;
       this.Edad=edad;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+Edad);
    }
    //metodo get
    public  int getExperiencia(){
        return Experiencia;
    }
    
    //metodo set
      public void setExperiencia(int experiencia){
        this.Experiencia=experiencia;
    }
    
}
