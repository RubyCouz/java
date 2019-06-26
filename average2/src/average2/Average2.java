/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average2;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Average2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** moyenne (V1.0, 25/06/19) ****");
        // déclaration des variables
        float min = 0;
        float max = 0;
        float integer;
        float average;
        float total = 0;
        float i = 0;
        boolean encore = true;
        // première boucle pour verification tant que la saisie n'est pas un nombre
        while (encore) {
            // try catch permettant la récuypération des erreurs et leur traitement
            try {
                System.out.println("Saisissez un entier :");
                integer = Console.lireI();
                // boucle permettant de faire la moyenne et coninuer la saisie tant que integer est différent de 0
                while (integer != 0) {
                    total += integer;
                    i++;
                    average = total / i;
                    // condition afin de vérifier la valeur de integer et de garder le min ou le max
                    if (integer > max) {
                        if (min == 0) {
                            min = max;
                        }
                        max = integer;
                    } else {
                        if (min == 0) {

                            min = integer;
                        } else if (integer < min) {
                            min = integer;
                        }
                    }
                    // affichage du résultat
                    System.out.println("valeur max : " + max);
                    System.out.println("valeur min : " + min);
                    System.out.println("total : " + total);
                    System.out.println("moyenne : " + total + " / " + i + " = " + average);
                    System.out.println("Saisissez un entier :");
                    integer = Console.lireI();
                }
                encore = false;
                // récupération et gestion des erreurs en cas de saisie non numérique
            } catch (Exception er) {
                System.out.println("ARGHHHH !!!!:");
                encore = true;
            }

        }

    }

}
