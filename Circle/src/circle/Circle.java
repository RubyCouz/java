/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import Outils.Console;



/**
 * Calcul de l'aire d'un cercle
 *
 * @author 59A0260
 */
public class Circle {

   final static double PI=3.1416;

        public static void main(String[] args)
        {            
            System.out.println("**** Périmètre et surface du Cercle (V1.0, 20/06/19) ****");
            double rayon; 
            double perimetre; 

            System.out.println("Entrer le rayon: ");
            rayon = Console.lireD();
            perimetre =  PI * rayon * rayon;
            System.out.print("L'aire vaut: ");
            System.out.println(perimetre);
        }

}
