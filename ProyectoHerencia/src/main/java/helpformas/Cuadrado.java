/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpformas;

import java.util.Scanner;

/**
 *
 * @author walter salez
 */
public class Cuadrado extends Formas {
    public double r,area;
    public Cuadrado(){
          Scanner in = new Scanner(System.in);
       System.out.println("Escriba el radio");
       r = in.nextInt();
       area=2*(r*r);
        setDibujar("Cuadrado");
    }
 

    @Override
    public double getinfoCalcular() {
     return area;    
    }
}
