/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TYT
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lea=new Scanner(System.in);
      int nentrada;
      
      nentrada = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese la cantidad de entradas : "));
      char[] letras = new char[nentrada];
        System.out.println("Ingrese los caracteres");
        
        for (int i = 0; i < nentrada; i++) {
            System.out.println((i+1) + " Favor ingresar el caracter");
            letras[i] = lea.next ().charAt(0);
        }
        System.out.println("Los caracteres ingresados son:");
            for (int i = 0; i <nentrada; i++) {
                System.out.println(letras[i]);
            
        }
    }
    
}
