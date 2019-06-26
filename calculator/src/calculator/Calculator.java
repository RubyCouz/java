/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import Outils.Console;

/**
 *
 * @author 59A0260
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**** calculatrice (V1.0, 20/06/19) ****");
        System.out.println("Saisissez un premier nombre :");
        int number1 = Console.lireI();
        System.out.println("Saisissez un signe opératoire :");
        char operator = Console.lireC();
        System.out.println("Saisissez un second nombre :");
        int number2 = Console.lireI();
        switch (operator) {
            case '+' :
                  System.out.println(number1 + " + " + number2 + " = " +  (number1 + number2));
                  break;
            case '-' :
                 System.out.println(number1 + " - " + number2 + " = "  + (number1 - number2));
                  break;
            case '*' :
                 System.out.println(number1 + " * " + number2 + " = "  + (number1 * number2));
                  break;
            case '/' :
                if (number2 == 0) {
                    System.out.println("Division par 0 impossible !!");
                } else {
                     System.out.println(number1 + " / " + number2 + " = "  + (number1 / number2));
                }
                  break;
        }
    }

}
