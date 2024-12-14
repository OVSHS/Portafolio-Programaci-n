/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valor_actual;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Valor_Actual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo del valor actual de una anualidad");
        System.out.print("Ingrese la renta por periodo (R): ");
        double renta = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interes (i) en porcentaje: ");
        double tasaInteres = scanner.nextDouble();
        System.out.print("Ingrese el numero de pagos (n): ");
        int numeroPagos = scanner.nextInt();
        System.out.print("Tipo de anualidad (ordinaria/anticipada): ");
        String tipoAnualidad = scanner.next();

        Anualidad anualidad = new Anualidad(renta, tasaInteres, numeroPagos, tipoAnualidad);
        double valorActual = calcularValorActual(anualidad);
        System.out.println("Valor Actual de la Anualidad: $" + valorActual);
        scanner.close();
    }

    public static double calcularValorActual(Anualidad anualidad) {
        double i = anualidad.tasaInteres / 100;
        int n = anualidad.numeroPagos;
        double R = anualidad.renta;
        double C = 0.0;

        if(anualidad.tipoAnualidad.equals("ordinaria")) {
            C = R * (1 - Math.pow(1 + i, -n)) / i;
        }
        else if(anualidad.tipoAnualidad.equals("anticipada")) {
            C = R * (1 + i) * (1 - Math.pow(1 + i, -n)) / i;
        }

        return C;
    }
    
    
}
