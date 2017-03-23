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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner input = new Scanner(System.in);

        //ask user for name and info about first test, calculating average
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("What was the first test out of?: ");
        double testonea = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double testoneb = input.nextDouble();
        double testonec = testoneb / testonea * 100;

        // ask for info about second test and calculating average                
        System.out.println("What was the second test out of?: ");
        double testtwoa = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double testtwob = input.nextDouble();
        double testtwoc = testtwob / testtwoa * 100;

        // asking for info about third test and calculating average       
        System.out.println("What was the third test out of?: ");
        double testthreea = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double testthreeb = input.nextDouble();
        double testthreec = testthreeb / testthreea * 100;

        // asking for info about fourth test and calculating average       
        System.out.println("What was the fourth test out of?: ");
        double testfoura = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double testfourb = input.nextDouble();
        double testfourc = testfourb / testfoura * 100;

        // asking for info about fifth test and calculating average        
        System.out.println("What was the fifth test out of?: ");
        double testfivea = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double testfiveb = input.nextDouble();
        double testfivec = testfiveb / testfivea * 100;

        // calculating overall average for all 5 tests
        double average = (testonec + testtwoc + testthreec + testfourc + testfivec) / 5;

        // outputting scores and overall average to user
        System.out.println(" ");
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + testonec);
        System.out.println("Test 2: " + testtwoc);
        System.out.println("Test 3: " + testthreec);
        System.out.println("Test 4: " + testfourc);
        System.out.println("Test 5: " + testfivec);
        System.out.println(" ");
        System.out.println("Average: " + average);
    }
}
