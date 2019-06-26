/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter;
// import du package "Console" situé dans "Outils"

import Outils.Console;
/**
 *
 * @author 59A0260
 */
public class Letter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // déclaration des variables
        String unicode;
   // texte
        System.out.println("**** conversion utf => unicode (V1.0, 20/06/19) ****");
        System.out.println("Saisissez un code Unicode pour afficher le caractère lui correspondant:");
        // lecture de la saisie
        unicode = Console.lireStr();
        
        byte[] arr = unicode.getBytes();
        System.out.println("UTF-8 pour " + unicode);
        // parcours du tableau
        for(byte a: arr) {
            System.out.println(a);
        }
    }
    
}
