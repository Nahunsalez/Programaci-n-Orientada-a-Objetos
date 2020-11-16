/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal;

/**
 *
 * @author walter salez
 */
public class Doctor extends Persona{
    private int DNI;
    private int Telefono;
    private double Salario;
    private String Direccion;
    
    //Abstraccion
    @Override
    int getDNI() {
        return DNI;
    }
    
    //metod get
    public int getTelefono(){
        return Telefono;
    }
     public double getSalario(){
        return Salario;
    }
      public String getDirrecion(){
        return Direccion;
      }
    //metodo set
   public void setDNI(int dni){
       this.DNI=dni;
   }
    public void setTelefono(int telefono){
        this.Telefono=telefono;
    }
    public void setSalario(double salario){
        this.Salario=salario;
    }
    public void setDireccion(String direccion){
        this.Direccion=direccion;
    }
    
}
