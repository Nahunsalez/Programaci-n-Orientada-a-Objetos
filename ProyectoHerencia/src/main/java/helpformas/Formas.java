/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpformas;

/**
 *
 * @author walter salez
 */
public abstract class Formas {
    //atributos
    private String Dibujar;
    private double Calcular;
    
    public Formas(){
    //Contrucor  sin parametros
    }
    //Establecer y Obtener los datos
       public void setDibujar(String dibujar){
        this.Dibujar=dibujar;
    }
    public void setCalcular(int calcular){
        this.Calcular=calcular;
    }
    public String getDibujar(){
        return this.Dibujar;
    }
    public double getCalcular(){
        return this.Calcular;
    }
    public void imprimirinformacion(){
        System.out.println("Dibujar: " + Dibujar);
    }
   //abstracion
    abstract double getinfoCalcular();  
}
