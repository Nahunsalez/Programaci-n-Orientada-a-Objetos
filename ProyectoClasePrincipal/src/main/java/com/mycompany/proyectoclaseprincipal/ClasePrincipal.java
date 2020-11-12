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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //instancia de la clase
        Profesor profesor = new Profesor();
        
        //creando el objeto al profesor
        profesor.setNombre("Walter");
        profesor.setApellido("Salez");
        profesor.setSexo("M");
        profesor.setEdad(24);
        profesor.setTelefono(96303933);
        profesor.setDireccion("San Pedro Sula");
        
        //Mostrar los datos
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellido: " + profesor.getApellido());
        System.out.println("Sexo: " + profesor.getSexo());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Telefono: " + profesor.getTelefono());
        System.out.println("Direccion: " + profesor.getDireccion());
    }
    
}
