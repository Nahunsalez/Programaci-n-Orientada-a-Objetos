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
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        float division = 0;

        System.out.println("Escriba el Primer Numero");
        n1 = in.nextInt();
        System.out.println("Escriba el Segundo Numero");
        n2 = in.nextInt();
        System.out.println("Escriba el Tercer Numero");
        n3 = in.nextInt();
        System.out.println("Escriba el Cuarto Numero");
        n4 = in.nextInt();

       suma = n1 + n2 + n3 + n4;
       resta = n1 - n2 - n3 - n4;
       multiplicacion = n1 * n2 * n3 * n4;
       division = n1 / n2 / n3 / n4;

       System.out.println("La Suma es: " + suma);
       System.out.println("La Resta es: " + resta);
       System.out.println("La Multiplicacion es: " + multiplicacion);
       System.out.println("La Division es: " + division);
    }
}
