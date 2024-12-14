/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclasee_semana5;

import java.util.Random;

/**
 *
 * @author TYT
 */
public class TrabajoClasee_semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random =new Random();
        int num = 1;
        int listanum[] = new int[10];
        for (int i = 0; i< 10; i++) {
            listanum[i]= random.nextInt(50);
        }
        for (int i = 0; i <10; i++) {
            System.out.println((i+1)+ "-->" + listanum[i]);
        }
    }
    
}
