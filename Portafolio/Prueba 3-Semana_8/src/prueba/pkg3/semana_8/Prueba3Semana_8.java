/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pkg3.semana_8;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Prueba3Semana_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Precios del Dia");
        System.out.print("Precio de comida Economica: $");
        double econ = scanner.nextDouble();
        System.out.print("Precio de comida Regular: $");
        double regular = scanner.nextDouble();
        System.out.print("Precio de comida Premium: $");
        double premium = scanner.nextDouble();
        System.out.print("Numero de extras disponibles: ");
        int numExtras = scanner.nextInt();
        double[] extras = new double[numExtras];
        for(int i=0; i<numExtras; i++) {
            System.out.print("Precio del Extra " + (i+1) + ": $");
            extras[i] = scanner.nextDouble();
        }
        ListaPrecios listaPrecios = new ListaPrecios(econ, regular, premium, extras);
      
        int totalPedidos = 0;
        double totalVentas = 0.0;
        boolean continuar = true;
        while(continuar) {
            System.out.println("\nNuevo Pedido");
            System.out.print("Nombre completo : ");
            String nombre = scanner.next();
            System.out.print("Direccion: ");
            String direccion = scanner.next();
            System.out.print("Numero de telefono: ");
            String telefono = scanner.next();
            String tipoCliente;
            while(true) {
                System.out.print("Tipo de cliente (regular/frecuente/tercer): ");
                tipoCliente = scanner.next().toLowerCase();
                if(tipoCliente.equals("regular") || tipoCliente.equals("frecuente") || tipoCliente.equals("tercer")) {
                    break;
                }
                System.out.println("Incorrceto,vuleva a intentarlo");
            }
            Cliente cliente = new Cliente(nombre, direccion, telefono, tipoCliente);

            String tipoComida;
            while(true) {
                System.out.print("Tipo de comida (Economica/Regular/Premium): ");
                tipoComida = scanner.next().toLowerCase();
                if(tipoComida.equals("economica") || tipoComida.equals("regular") || tipoComida.equals("premium")) {
                    break;
                }
                System.out.println("Tipo de comida incorrecto");
            }
            double precioComida = 0.0;
            switch(tipoComida) {
                case "economica":
                    precioComida = listaPrecios.precioEconomico;
                    break;
                case "regular":
                    precioComida = listaPrecios.precioRegular;
                    break;
                case "premium":
                    precioComida = listaPrecios.precioPremium;
                    break;
            }

            double totalExtras = 0.0;
            listaPrecios.mostrarExtras();
            System.out.print("Cuantos extras? (0 para ninguno): ");
            int numSeleccionExtras = scanner.nextInt();
            if(numSeleccionExtras > 0){
                for(int i=1; i<=numSeleccionExtras; i++){
                    System.out.print("Ingrese el numero del extra " + i + ": ");
                    int numeroExtra = scanner.nextInt();
                    if(numeroExtra >=1 && numeroExtra <= listaPrecios.preciosExtras.length){
                        totalExtras += listaPrecios.preciosExtras[numeroExtra -1];
                    } else {
                        System.out.println("Extra " + numeroExtra + " Incorrecto");
                    }
                }
            }

            double subtotal = precioComida + totalExtras;
            double descuento = 0.0;
            if(cliente.getTipoCliente().equals("frecuente")) {
                descuento = 0.15;
            } else if(cliente.getTipoCliente().equals("tercer")) {
                descuento = 0.25;
            }
            double total = subtotal - (subtotal * descuento);

            System.out.println("\nFactura");
            System.out.println("Cliente: " + cliente.getNombreCompleto());
            System.out.println("Tipo de Cliente: " + cliente.getTipoCliente());
            System.out.println("Comida: " + tipoComida + " - $" + precioComida);
            System.out.println("Extras: $" + totalExtras);
            if(descuento > 0) {
                System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
            }
            System.out.println("Total a pagar: $" + total);
            System.out.println("================\n");

            totalPedidos++;
            totalVentas += total;

            System.out.print("Desea hacer otro pedido? (si/no): ");
            String respuesta = scanner.next();
            if(!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("\nResumen");
        System.out.println("Numero total de pedidos: " + totalPedidos);
        System.out.println("Cantidad total vendida: $" + totalVentas);
    }
    
}
