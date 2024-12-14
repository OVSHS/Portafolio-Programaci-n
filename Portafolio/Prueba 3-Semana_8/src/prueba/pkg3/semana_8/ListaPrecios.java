/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg3.semana_8;

/**
 *
 * @author TYT
 */
public class ListaPrecios {
    public double precioEconomico;
    public double precioRegular;
    public double precioPremium;
    public double[] preciosExtras;

    public ListaPrecios(double precioEconomico, double precioRegular, double precioPremium, double[] preciosExtras) {
        this.precioEconomico = precioEconomico;
        this.precioRegular = precioRegular;
        this.precioPremium = precioPremium;
        this.preciosExtras = preciosExtras;
    }

    public void mostrarExtras() {
        System.out.println("Extras disponibles:");
        for (int i = 0; i < preciosExtras.length; i++) {
            System.out.println((i + 1) + ". Extra " + (i + 1) + " - $" + preciosExtras[i]);
        }
    }
}
