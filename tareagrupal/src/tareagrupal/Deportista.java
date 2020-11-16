/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal;

/**
 *
 * @author Estrella
 */

//SUBCLASE DEPORTISTA

    //HERENCIA
public class Deportista extends Persona {
    
    //ATRIBUTOS
   
   private String fecha;
   private String equipo;
   private double estatura;
   private double salario;
   
   
   //getter and setters

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
    
    //METODO
   public void trayectoria(){
    int PT =26;
    int GA =17;
       
       System.out.println("AÑO 2020:\nPartidos totales:"+PT+"\nGoles anotados:"+GA);
          
   }

    @Override
    int getDNI() {
        return 10243;
    }
  

}