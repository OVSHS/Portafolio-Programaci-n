/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase2;

import javax.swing.JOptionPane;

/**
 *
 * @author TYT
 */
public class EjercicioClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcion = 1;
        int numero;
       
          while(opcion!=2){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion" + "\n"
                  + "1. Ejercicio" + "\n"
                     + "2. Salir(Se necesita que sea 0 para salir)"));
        
        if(opcion==1){
          numero =   Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
          if(numero >= 0 ){
                JOptionPane.showMessageDialog(null, "Su numero es positivo ");
          }else{
               JOptionPane.showMessageDialog(null, "Su numero es negativo ");
          }
        }
        if(opcion ==0){
            break;
        }
    }
    
}
}