/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoherencia;
import helpformas.Circulo;
import helpformas.Cuadrado;
import helpformas.Linea;
import helpformas.Triangulo;
/**
 *
 * @author walter salez
 */
public class ClasePrincipal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo =new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println("  ");
        circulo.imprimirinformacion();        
        System.out.println("Calculo de radio: "+circulo.getinfoCalcular());
        
        System.out.println("  ");
        linea.imprimirinformacion();
        System.out.println("Largo: "+linea.getinfoCalcular());
        
         System.out.println("  ");
        triangulo.imprimirinformacion();
        System.out.println("Calcular el area: "+triangulo.getinfoCalcular());
        
         System.out.println("  ");
        cuadrado.imprimirinformacion();
        System.out.println("Calcular el area: "+cuadrado.getinfoCalcular());
    }
 }
