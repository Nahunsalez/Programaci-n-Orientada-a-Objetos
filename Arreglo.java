/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter nahun salez
 */
import java.util.Scanner;
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String[] Nombre = new String[20];
        for (int i = 0; i<Nombre.length; i++)
        {
            System.out.println("Escriba el nombre de una Ciudad");
            Nombre[i]=in.next();
        }
        for (int i = 0; i<Nombre.length; i++)
        {
            System.out.println(i+". "+Nombre[i]);
           
        }
        
    }
}
