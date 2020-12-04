/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import java.util.Scanner;

/**
 *
 * @author oralb
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradCent, gradKel;
        char opc;
        
        
        do {
            System.out.println("Convertir grados centigrados a grados kelvin: ");
            System.out.print("Ingrese la tem grados centigrados: ");
            gradCent = teclado.nextDouble();
            gradKel = gradCent + 273;
            System.out.println("Grados centigrado: "+gradCent+" Grados Kelvin: "+gradKel);
            System.out.println("Desea continuar?");
            opc = teclado.next().charAt(0);
        } while (opc == 's' || opc == 'S');
    }    
}
