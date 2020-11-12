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
public class modulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int edad;
        int Numero1, Numero2;
        int Numero;
        
         Recursos recurso = new Recursos();
         System.out.println("Primer Metodo Saludo");
         recurso.saludo();
         
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Seugundo Metodo Edad");
        System.out.println("Escriba su Edad");
        edad=in.nextInt();
        recurso.Edad(edad);
       
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Tercer Metodo Multiplicacion");
        System.out.println("Escriba Primer Numero");
        Numero1=in.nextInt(); 
        System.out.println("Escriba Segundo Numero");
        Numero2=in.nextInt();
        recurso.Multiplicacion(Numero1, Numero2);
        
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Cuarto Metodo Lista de Numeros");
        System.out.println("Escriba un numero");
        Numero=in.nextInt();
        System.out.println("  ");
        recurso.Lista(Numero);
       
        
        
    }

public static class Recursos{
    //1.Saludo
    public void saludo(){
      System.out.println("Estoy Aprendiendo, pero sere el mejor programador");
    }
    
    //2. La edad
    public void Edad(int edades){
        if (edades>18){
            System.out.println("Eres Mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    
    //3. Multiplicacion
    public void Multiplicacion(int N1, int N2){
        int R;
        R = N1*N2;
        System.out.println("El Resultado de la Multiplicacion es: " + R);
    }
    //4. Lista
    public void Lista(int N){
        for(int i = 1; i<=N;i++){
            System.out.println(i);
        }
    }
    
}
}
