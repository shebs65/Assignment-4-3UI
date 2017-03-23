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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);
       
        // asking user for prom prices
        System.out.println("How much does the food for prom cost? :");
        double foodcost = input.nextDouble();
        System.out.println("How much does the DJ cost? :");
        double djcost = input.nextDouble();
        System.out.println("How much does it cost to rent the hall? :");
        double hallcost = input.nextDouble();
        System.out.println("How much do decorations cost? :");
        double decorationcost = input.nextDouble();
        System.out.println("How much does it cost for staff? :");
        double staffcost = input.nextDouble();
        System.out.println("How much for miscellaneous costs? :");
        double misccost = input.nextDouble();
     
        // calculating total cost
        double totalcost = foodcost + djcost + hallcost + decorationcost + staffcost + misccost;
     
        // calculating number of tickets needed
        double tickets = totalcost / 35 + 1;

        // rounding tickets
        tickets = Math.round(tickets);

        // outputting total cost and number of tickets needed to break even to user
        System.out.println(" ");
        System.out.println("The total cost is $" + totalcost + ". You will need to sell " + tickets + " tickets to break even.");




    }
}
