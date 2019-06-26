/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;
// import du package "Console" situé dans "Outils"

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("**** Moyenne de note (V1.0, 20/06/19) ****");
        // déclaration des variables
        float note1;
        float note2;
        float note3;
        float average;
        // saisie des notes
        System.out.println("Note de D.S :");
        // lecture des saisies
        note1 = Console.lireF();
        System.out.println("Note de D.M :");
        note2 = Console.lireF();
        System.out.println("Note de T.P :");
        note3 = Console.lireF();
         average = (note1 * 3) + (note2 * 2) + note3;
         average = average / 6;
         System.out.println("Votre moyenne : " + average);
    }

}
