/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author TYT
 */
public class Herencia {
    public static void ordenar(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 10; y++) {
                if(toyota[y-1].getAnnio()>toyota[y].getAnnio()){
                   temp =  toyota[y-1];
                    toyota[y] = toyota[y-1];
                    toyota[y-1] = temp;
                }
            }
        }
    }
    public static void presentar(){
        for (int i = 0; i < 10; i++) {
            System.out.println("El modelo es: " + toyota[i].getModelo());
            System.out.println("El ano del vehiculo es: " + toyota[i].getAnnio());
        }
    }

    public static turismo toyota[] = new turismo[3];
    public static turismo temp = new turismo();
    public static void main(String[] args) {
       toyota[0] = new turismo();
       toyota[0].setModelo("Yaris");
       toyota[0].setAnnio(2018);
       toyota[0].setTam_baul(2);
        
       toyota[1] = new turismo();
       toyota[1].setModelo("Corolla");
       toyota[1].setAnnio(2020);
       toyota[1].setTam_baul(3);
       
       toyota[2] = new turismo();
       toyota[2].setModelo("Tercel");
       toyota[2].setAnnio(2008);
       toyota[2].setTam_baul(1);
       
       presentar();
    }
    
}
