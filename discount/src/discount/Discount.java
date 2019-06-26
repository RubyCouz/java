/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float port;
        float rem;
        float pap;
        float tot;
        System.out.println("**** remise (V1.0, 24/06/19) ****");
        System.out.println("Saisissez un prix unitaire :");
        float pu = Console.lireF();
        System.out.println("Saisissez une quantité :");
        float qte = Console.lireF();
        tot = pu * qte;

        if (tot < 100) {
            rem = 0;
            port = tot * 2 / 100;
            if (port < 6) {
                port = 6;
            }
            pap = tot - rem + port;
            System.out.println("Prix unitaire : " + pu + "€");
            System.out.println("Quantité : " + qte);
            System.out.println("Remise : " + rem + "€");
            System.out.println("Frais de port : " + port + "€");
            System.out.println("Prix à payer : " + pap + "€");
        } else if (tot < 200) {
            rem = tot * 5 / 100;
            port = tot * 2 / 100;
            if (port < 6) {
                port = 6;
            }
            pap = tot - rem + port;
            System.out.println("Prix unitaire : " + pu + "€");
            System.out.println("Quantité : " + qte);
            System.out.println("Remise : " + rem + "€");
            System.out.println("Frais de port : " + port + "€");
            System.out.println("Prix à payer : " + pap + "€");
        } else if (tot < 500) {
            rem = tot * 10 / 100;
            port = tot * 2 / 100;
            if (port < 6) {
                port = 6;
            }
            pap = tot - rem + port;
            System.out.println("Prix unitaire : " + pu + "€");
            System.out.println("Quantité : " + qte);
            System.out.println("Remise : " + rem + "€");
            System.out.println("Frais de port : " + port + "€");
            System.out.println("Prix à payer : " + pap + "€");
        } else {
            rem = tot * 10 / 100;
            port = 0;
            pap = tot - rem + port;
            System.out.println("Prix unitaire : " + pu + "€");
            System.out.println("Quantité : " + qte);
            System.out.println("Remise : " + rem + "€");
            System.out.println("Frais de port : " + port + "€");
            System.out.println("Prix à payer : " + pap + "€");
        }
    }

}
