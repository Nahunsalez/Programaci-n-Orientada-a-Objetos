/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

/**
 *
 * @author wlater salez
 */
public abstract class Moneda {
    
     //Datos
    private double convertir;
    
    
    //asbtraccion
    abstract String getNombre();
    abstract double geteuro();
    abstract double getlempiras();
    abstract double getdolares();
    
    public Moneda()
    {
        
    }
    //metodo get
    public double getconvertir(){
        return convertir;
    }
  
    
    //metodo set
    public void setconvertir(double conver){
        this.convertir=conver;
    }
   
   
}
