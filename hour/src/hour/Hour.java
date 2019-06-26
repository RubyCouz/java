/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hour;
// import du package "Console" situé dans "Outils"

import Outils.Console;
/**
 *
 * @author 59A0260
 */
public class Hour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // déclaration des variables
        int duration;
        int hour;
        int minute;
        int seconde;
        
        System.out.println("**** formatage du nombre de secondes en HH:MM:SS (V1.0, 20/06/19) ****");
        // demande de saisie
        System.out.println("Saisissez un nombre de seconde à formater au format HH:MM:SS :");
        // révupération de la saisie
        duration = Console.lireI();
        hour = duration / 3600;
        minute = (duration % 3600) / 60;
        seconde = (duration %3600) % 60;
        System.out.println(duration + "s correspond à " + hour + ":" + minute + ":" + seconde + ".");
    }
    
}
