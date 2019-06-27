/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterage;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class CounterAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** nombre de jeune, vieux, ... (V1.0, 26/06/19) ****");
        System.out.println("Saisissez un age entre 0 et 100 ans :");
        // déclaration des variables
        int young = 0;
        int average = 0;
        int old = 0;
        int age = Console.lireI();
        // début de la boucle "tant que l'age saisi est inférieur ou égale à 100"
        while (age <= 100) {
            // si age est inférieur à 20
            if (age < 20) {
                System.out.println("Saisissez un age entre 0 et 100 ans :");
                age = Console.lireI();
                // incrémentation du compte de jeune
                young++;
                // si age est compris entre 40 et 100
            } else if (age > 40  && age < 100) {
                System.out.println("Saisissez un age entre 0 et 100 ans :");
                age = Console.lireI();
                // incrémentation de vieux
                old++;
                // si age est égale à 100
            } else if (age == 100) {
                // incrémentation de vieux
                old++;
                // arrêt de la boucle
                break;
            } else {
                // pour tous les autres cas
                average++;
                System.out.println("Saisissez un age entre 0 et 100 ans :");
                age = Console.lireI();
            }
        }
        // affichage des résultats lorsque la boucle est arrétée
        System.out.println("Nombre de jeunes : " + young);
        System.out.println("Nombre de moyens : " + average);
        System.out.println("Nombre de vieux : " + old);
    }

}
