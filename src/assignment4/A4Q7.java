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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for user input
        Scanner input = new Scanner(System.in);
       
        //create integer for position starting at 1
        int position = 1;
       
        // loop
        while (true) {
          
            // ask user to input sum of dice, then scan it in
            System.out.println("Enter sum of dice: ");
            int dice = input.nextInt();
          
            // if dice = 0, output quit message and terminate
            if (dice == 0) {
                System.out.println("You Quit!");
                break;
            }
            // if dice is between 2 and 12, add it to position. If position = positions with snakes or ladders, set position to specified square
            if (dice > 1 && dice < 13) {
                position = position + dice;
                if (position == 54) {
                    position = 19;
                }
                if (position == 90) {
                    position = 48;
                }
                if (position == 99) {
                    position = 77;
                }
                if (position == 9) {
                    position = 34;
                }
                if (position == 40) {
                    position = 64;
                }
                if (position == 67) {
                    position = 86;
                }
              
                // if position is > 100, subtract that dice roll from the position. If position = 100, output win message and terminate
                if (position > 100) {
                    position = position - dice;
                }
                if (position == 100) {
                    System.out.println("You are now on square " + position);
                    System.out.println("You Win!");
                    break;
                }
              
                // output position after every roll
                System.out.println("You are now on square " + position);








            }
        }
    }
}