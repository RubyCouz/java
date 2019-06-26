/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participation;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Participation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** participation (V1.0, 24/06/19) ****");
        int celib;
        int children;
        int participation;
        int salaire;
        System.out.println("L'employé est-il célibatiare ? (0 = Oui/ 1 = Non)");
        celib = Console.lireI();
        System.out.println("L'employé a-t-il des enfants ?");
        children = Console.lireI();
        System.out.println("Salaire de l'employé ?");
        salaire = Console.lireI();
        switch (celib) {
            case 0:
                participation = 20 + (children * 10);
                if (salaire < 1200) {
                    participation += 10;
                }

                if (participation > 50) {
                    participation = 50;
                }
                System.out.println("Participation : " + participation);
                break;
            case 1:
                participation = 25 + (children * 10);
                if (salaire < 1200) {
                    participation += 10;
                }

                if (participation > 50) {
                    participation = 50;
                }
                System.out.println("Participation : " + participation);
                break;
        }
    }

}
