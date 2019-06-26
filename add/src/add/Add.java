/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// indication du package uitlisé
package add;
// import du package "Console.java" situé dans "Outils"

import Outils.Console;

/**
 *
 * @author 59A0260
 */
// déclaration de la classe Add
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("**** addition (V1.0, 20/06/19) ****");
        // déclaration des variables
        double firstNumber;
        double secondNumber;
        double result;
        // demande la saisie d'un nombre
        System.out.println("Entrer un premier nombre: ");
        // sert à lire le nombre saisi par l'utilisateur
        firstNumber = Console.lireD();

        System.out.println("Entrer un second nombre: ");
        secondNumber = Console.lireD();
        // addtion des 2 nombres et stockage du résultat dans une variable
        result = firstNumber + secondNumber;
        // formatage avec concaténation et affichage console
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
    }

}
