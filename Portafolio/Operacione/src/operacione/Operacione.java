/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacione;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Operacione {

    /**
     * @param args the command line arguments
     */
    public static void suma(){
        Scanner lea=new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese numero 1");
        n1 = lea.nextInt();
         System.out.println("Ingrese numero 2");
          n2 = lea.nextInt();
          System.out.println(" La suma de los numeros es: "+ (n1+n2));
          
    }
    
    
     public static void resta(){
        Scanner lea=new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese numero 1");
        n1 = lea.nextInt();
         System.out.println("Ingrese numero 2");
          n2 = lea.nextInt();
          System.out.println(" La resta de los numeros es: "+ (n1-n2));
     }
     
      public static void Multiplicacion(){
        Scanner lea=new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese numero 1");
        n1 = lea.nextInt();
         System.out.println("Ingrese numero 2");
          n2 = lea.nextInt();
          System.out.println(" La Multiplicacion de los numeros es: "+ (n1*n2));
     }
      
      
      
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int op;
        do{
        System.out.println("Menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Salir");
        op = lea.nextInt();
        
        
            switch (op){
                case 1:
                    suma();
                    break;
                    
                     case 2:
                         resta();
                    break;
                    
                     case 3:
                         Multiplicacion();
                    return;
                    
                    
                     case 4:
                    break;
                     default:
                         System.out.println("opcion invalida");
  
            }
        }while (op!=0);
    }
    
}
