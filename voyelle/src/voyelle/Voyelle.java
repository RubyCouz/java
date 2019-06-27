/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyelle;


import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Voyelle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // déclaration des variables
        int i = 0; // => variable de position du cursuer dans la chaine de caractère
        int count = 0; // => compte le nombre de voyelle dans la chaine de caractère
        String letter; // => stock la lettre analysée
        // demande de saisie d'un mot
        System.out.println("**** voyelle (V1.0, 26/06/19) ****");
        System.out.println("Saisir un mot :");
        // lecture du mot et stockage de celui-ci dans une variable
        String word = Console.lireStr();
        // calcul de la taille du mot
        int wordLength = word.length();
        // boucle permettant de parcourir le mot saisi
        while (i < wordLength) {
            // découpage du mot lettre par lettre, a chaque tour de boucle on passe à la letttre suivante
            letter = word.substring(i, (i + 1));
            // on incrément pour déplacer le "curseur"
            i++;
            // condition qui va vérifier chaque lettre à chaque tour de boucle
            switch (letter) {
                case "a":
                    count++;
                    break;
                case "e":
                    count++;
                    break;
                case "i":
                    count++;
                    break;
                case "o":
                    count++;
                    break;
                case "u":
                    count++;
                    break;
                case "y":
                    count++;
                    break;
                default:
                    break;
            }
        }
        // affichage du résultat
        System.out.println("Nombre de voyelles dans le mot '" + word + "' : " + count);
    }

}
