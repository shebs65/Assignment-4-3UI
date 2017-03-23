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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        // ask user to enter measurement in inches
        System.out.println("Please enter the measurement in inches which you wish to convert:");
        // scanning measurement into a double
        double measurement = input.nextInt();
        // multiplying measurement by 2.54 to get double fmeasurement
        double fmeasurement = measurement * 2.54;
        // tell user their measurement converted to cm
        System.out.println(measurement + " inches is the same as " + fmeasurement + "cm");


    }
}
