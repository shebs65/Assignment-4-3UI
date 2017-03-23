/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author shebm3906
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // ask user to input speed limit, then scan in limit as an integer
        System.out.println("Please enter the speed limit. :");
        int limit = input.nextInt();
       
        // ask user to input speed, then scan in speed as an integer
        System.out.println("Please enter your speed. :");
        int speed = input.nextInt();
       
        // if speed is less than or equal to the limit, output congratulations message
        if (speed <= limit) {
            System.out.println("Congratulations, you are within the speed limit!");            
        }
       
        // depending on how fast user is going over the limit, output a fine message with a different cost
        if (speed - limit >= 1 && speed - limit <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        }
        if (speed - limit >= 21 && speed - limit <= 30) {
            System.out.println("You are speeding and your fine is $270.");           
        }
        if (speed - limit >= 31) {
            System.out.println("You are speeding and your fine is $500.");


        }
    }
}
