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
public class Linea extends Formas {
    private double n;
    public Linea(){
          Scanner in = new Scanner(System.in);
       System.out.println("Escriba el largo");
       n = in.nextInt();
       setDibujar("Linea");
    }

    @Override
    public double getinfoCalcular() {
       return n;
         }
}
