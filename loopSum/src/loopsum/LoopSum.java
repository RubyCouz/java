/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsum;
import Outils.Console;
/**
 *
 * @author 59A0260
 */
public class LoopSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("**** somme de nombre (V1.0, 24/06/19) ****");
        System.out.println("Saisissez un nombre :");
        int tot = 0;
        int i = 0;
        int n = Console.lireI();
        for(i = 0; i <= n; i++) {
           tot = tot + i;
            System.out.println(tot);
        }
    }
    
}
