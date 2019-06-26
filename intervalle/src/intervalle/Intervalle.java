/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intervalle;
import Outils.Console;
/**
 *
 * @author 59A0260
 */
public class Intervalle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("**** somme de nombre d'un intervalle(V1.0, 24/06/19) ****");
          int i;
          int tot = 0;
        System.out.println("Saisissez un nombre :");
        int n1 = Console.lireI();
        System.out.println("Saisissez un nombre :");
        int n2 = Console.lireI();
        if (n1 > n2) {
            for (i = n2; i <= n1; i++) {
                tot = tot + i;
                  System.out.println(tot);
            }
        } else {
             for (i = n1; i <= n2; i++) {
                tot = tot + i;
                  System.out.println(tot);
            }
        }
    }
    
}
