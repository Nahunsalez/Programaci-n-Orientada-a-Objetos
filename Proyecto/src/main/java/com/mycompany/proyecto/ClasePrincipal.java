/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import Helpais.Elsalvador;
import Helpais.Guatemala;
import Helpais.Honduras;
import helciudadania.Ciudadano;

/**
 *
 * @author Nahun Salez
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //encapsulamiento
         System.out.println("Encapsulamiento");
        Ciudadano ciudadano = new Ciudadano("Nahun", 24);
        
        //Mostrar valores 
        ciudadano.imprimir();
        //establecer una variable privada
        ciudadano.setExperiencia(2);
        
        //inmprimir valor de una variable privada
          System.out.println("Año de Experiencia: "+ ciudadano.getExperiencia());
          System.out.println("  ");
          
        //abstraccion
        
        Honduras hn= new Honduras();
        Elsalvador sv = new Elsalvador();
        Guatemala gt =new Guatemala();
        
        //imprimir abstraccion
        System.out.println("Abstraccion");
        System.out.println("Pais: " + hn.getPais());
        System.out.println("Presidente: " + hn.getPresidente());
        System.out.println("  ");
        System.out.println("Pais: " + sv.getPais());
        System.out.println("Presidente: " + sv.getPresidente());
         System.out.println("  ");
        System.out.println("Pais: " + gt.getPais());
        System.out.println("Presidente: " + gt.getPresidente());
    }    
    
}
