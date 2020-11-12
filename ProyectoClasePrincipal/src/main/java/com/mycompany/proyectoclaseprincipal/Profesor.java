/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclaseprincipal;

/**
 *
 * @author walter nahun salez
 */
public class Profesor {
    //private que se hace los atributos
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private int Edad;
    private int Telefono;
    private String Direccion;
    
    //Metodo publico para acceder a los datos
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getSexo(){
        return Sexo;
    }
    public int getEdad(){
        return Edad;
    }
    public int getTelefono(){
        return Telefono;
    }
    public String getDireccion(){
        return Direccion;
    }
    
    //Metodos pblicos para establecer datos
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public void setSexo(String Sexo){
        this.Sexo = Sexo;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
}
