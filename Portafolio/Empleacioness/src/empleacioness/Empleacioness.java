/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleacioness;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Empleacioness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos[] pro = new Productos[50];
        Scanner lea = new Scanner(System.in);

        int opcion = 0;
        int contador = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir ");
            opcion = lea.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = lea.next();

                System.out.println("Ingrese el precio: ");
                double precio = lea.nextDouble();

                System.out.println("Ingrese la cantidad: ");
                int cant = lea.nextInt();
                
                
                pro[contador] = new Productos (nombre,precio,cant);
                contador++;
            }
                if(opcion == 2){
                    for (int i = 0; i < contador; i++) {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Producto N. " + (i +1)+ ":" + pro[i].getNombre());
                        System.out.println("El precio: " + pro[i].getPrecio());
                        System.out.println("La cantidad es: "+ pro[i].getCant());
                        System.out.println("-------------------------------------------------------------------");
                    }
                }
            
        } while (opcion != 4);

    }

}
