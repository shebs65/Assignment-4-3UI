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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input from user   
        Scanner input = new Scanner(System.in);
        // ask user for name
        System.out.println("Please enter your name:");
        //scan name into next line
        String name2 = input.nextLine();
        // say hello to user
        System.out.println("Hello " + name2 + ". How are you today?");
    }
}
