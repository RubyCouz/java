/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import Outils.Console;
import java.util.Calendar;
/**
 *
 * @author 59A0260
 */
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("**** age (V1.0, 20/06/19) ****");
// déclaration d'une nouvelle instance "Calendar" => retourne les information du calendrier grégorien local en cours, stockédans la variable rightNow
        Calendar rightNow = Calendar.getInstance();
        // affichage info calendrier grégorien local
        // System.out.println(rightNow);
        // affichage de l'année en cours
        // System.out.println ("ANNÉE:" + rightNow.get(Calendar.YEAR));
        // stockage de l'année en cours dans une variable
        int currentYear = rightNow.get(Calendar.YEAR);
        // saisie de l'année de l'utilisateur
        System.out.println("Saisissez votre année de naissance :");
        // lecture de la saisie et stockage dans une variable
        int yearOfBirth = Console.lireI();
        // calcul de l'age
        int age = currentYear - yearOfBirth;
        // affichage du résultat
        System.out.println("Vous avez " + age + " an(s)!!");
    }

}
