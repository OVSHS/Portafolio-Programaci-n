/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorr;

/**
 *
 * @author TYT
 */
public class Constructorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] personas = new Persona[6];
        personas[0] = new Persona("Mario", 32);
        personas[1] = new Persona("Luigi", 25);
        personas[2] = new Persona("Pepe", 28);
        personas[3] = new Persona("Maverick", 40);
        personas[4] = new Persona("Loco", 22);
        personas[5] = new Persona("pedro", 18);
        
        
            for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].edad > personas[j + 1].edad) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
             System.out.println("Personas ordenadas por edad:");
        for (int i = 0; i < personas.length; i++) {
            personas[i].mostrar();
            System.out.println();
    }
}

}