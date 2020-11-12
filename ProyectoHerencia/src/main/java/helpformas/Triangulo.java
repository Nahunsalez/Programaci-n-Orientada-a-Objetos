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
public class Triangulo extends Formas {
    private double b,a,area;
    public Triangulo(){
        Scanner in = new Scanner(System.in);
       System.out.println("Escriba la base");
       b = in.nextInt();
       System.out.println("Escriba la altura");
       a = in.nextInt();
       area=(b*a)/2;
        setDibujar("Triangulo");
    }

  
    @Override
   public double getinfoCalcular() {
        return area;
    }
    
}
