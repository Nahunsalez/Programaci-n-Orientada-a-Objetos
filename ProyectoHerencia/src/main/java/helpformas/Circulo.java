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
import java.util.Scanner;
public class Circulo extends Formas{
   
    private double n,r;
     
    public Circulo(){
       Scanner in = new Scanner(System.in);
       System.out.println("Escriba el diametro");
       n = in.nextInt();
       r=n/2;
       setDibujar("Circulo"); 
    }

   
    @Override
    public double getinfoCalcular() {
        return r;
    }
}
