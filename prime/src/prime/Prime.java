/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** Nombre premier (V1.0, 26/06/19) ****");
        System.out.println("Saisir un nombre : ");
        // déclaration des variables
        int number = Console.lireI();
        int n = 2;
        int divide = 0;
        boolean bool = true;
        // boucle parcourant les entiers entre n et racine carré du nombre saisi
        while (n <= Math.sqrt(number)) {
            // on divise notre nombre par n
            divide = number / n;
            // si le resultat est différent de 0 et que le reste est égale à 0
            if (divide != 0 && number % n == 0) {
                // on definit la variable bool à false
                bool = false;
                // et arrêt de la boucle
                break;
            }
            // incrémentation de n
            n++;
        }
        // si le resultat est différent de 0 et que le reste est égale à 0
        if (bool == false) {
            System.out.println("Ce nombre n'est pas premier.");
        } else {
            System.out.println("Ce nombre est premier");
        }
    }

}
