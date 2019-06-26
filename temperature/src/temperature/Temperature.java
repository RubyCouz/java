/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;
// import du package "Console" situé dans "Outils"
import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("**** Conversion (V1.0, 20/06/19) ****");
        // déclaration des variables
        float celsius;
        float far;
        int choice;
        // affichage du choix
        System.out.println("Choisissez une conversion :");
        System.out.println("1 : Celsius => Fahreneit");
        System.out.println("2 : Fahreneit => Celsius");
        // lecture du choix et stckage de sa valeur dans une variable
        choice = Console.lireI();
        // condition si choice = 1
        if (choice == 1) {
            // saisie de la température 
            System.out.println("Saisissez une température en degrés Celsius");
            //lecture de la saisie
            celsius = Console.lireF();
            // opération de conversion
            far = celsius * 9 / 5;
            far = far + 32;
            // formatage et affichage du résultat
            System.out.println(celsius + " degrés Celsius est égale à " + far + " degrés Fahreneit.");
        } else {
            // même procédure que ci-dessus
            System.out.println("Saisissez une température en degrés Fahreneit");
            far = Console.lireF();
            celsius = far - 32;
            celsius = celsius * 5 / 9;
            System.out.println(far + " degrés fahreneit est égale à " + celsius + " degrés celsius.");
        }

    }

}
