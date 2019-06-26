/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Multiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** multiple (V1.0, 25/06/19) ****");
        // déclaration des variables
        int n;
        int x;
        int i;
        // demande de saisie
        System.out.println("Saisissez un nombre :");
        x = Console.lireI();
        System.out.println("Saisissez le nombre d'opération :");
        n = Console.lireI();
        for (i = 0; i <= n; i++) {
            System.out.println(x + " * " + i + " = " + (i * x));
        }
    }

}
