/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parité;
// import du package "Console" situé dans "Outils"

import Outils.Console;
/**
 *
 * @author 59A0260
 */
public class Parité {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number;
        System.out.println("**** parité (V1.0, 20/06/19) ****");
        System.out.println("Saisissez un nombre");
        number = Console.lireI();
        if (number % 2 == 0) {
            System.out.println(number + " est un nombre pair");
        } else {
            System.out.println(number + " est un nombre impair");
        }
    }
    
}
