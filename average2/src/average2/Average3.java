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
public class Average3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** moyenne (V1.0, 25/06/19) ****");
        System.out.println("Saisissez un entier :");
        // déclaration des variables
        int integer;
        int average;
        int total;
        int i;
        boolean encore = true;
        while (encore) {
            try {
                System.out.println("Saisissez un entier :");
                integer = Console.lireI();
                encore=false;
            }
            catch(Exception er) {
                System.out.println("ARGHHHH !!!!:");
                encore = true;
            }
            
        }
        System.out.println("fin");
//        System.out.println("Saisir une note :");
//        integer = Console.lireI();
//        while (integer != 0) {
//
//        }
    }

}
