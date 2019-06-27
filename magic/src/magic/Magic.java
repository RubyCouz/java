/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic;

import Outils.Console;
import java.util.Random;

/**
 *
 * @author 59A0260
 */
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** Nombre magique (V1.0, 27/06/19) ****");
        // définition des variables utiles pour l'exécution du code
        int magic = 0;
        int userNumber = 0;
        int question = 1;
        int count = 0;

        // début de la boucle permettant de rejouer
        while (question == 1) {
            //definition d'un nombre aléatoire
            Random rand = new Random();
            magic = rand.nextInt(100 + 1);
            //début de la boucle comprenant les conditions de comparaison du nbre choisi avec l'utilisateur
            while (userNumber != magic) {
                //demande de saisie
                System.out.println("Saisissez un nombre : ");
                userNumber = Console.lireI();
                // si les 2 nombres sont identiques
                if (userNumber == magic) {
                    // affichage d'un message, plus le nombre d'essais
                    System.out.println("Félicitation! vous avez trouvé la bonne répons en " + (count + 1) + " coup(s) !!");
                    // si le nombre random est plus petit
                } else if (userNumber > magic) {
                    System.out.println("Plus petit !!");
                    count++;
                    // si le nombre random est plus grand
                } else {
                    System.out.println("Plus grand");
                    count++;
                }
            }
            // demande pour rejouer
            System.out.println("voulez-Vous rejouer (1 => Oui / 0 => Non) ?");
            question = Console.lireI();
            // si l'utilisateur refuse
            if (question == 0) {
                System.out.println("Merci d'avoir participer.");
            }
        }
    }

}
