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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for user input
        Scanner input = new Scanner(System.in);
        // tell user to enter 4 numbers on seperate lines
        System.out.println("Please enter in 4 numbers on seperate lines:");
        // scan 4 doubles in on seperate lines
        double none = input.nextDouble();
        double ntwo = input.nextDouble();
        double nthree = input.nextDouble();
        double nfour = input.nextDouble();
        // output numbers to user
        System.out.println("Your numbers were " + none + ", " + ntwo + ", " + nthree + ", and " + nfour);




    }
}
