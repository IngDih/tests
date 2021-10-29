/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Scanner;

/**
 *
 * @author Ingrid
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKB = new Scanner(System.in);
        System.out.println("How many siblings do you have?");
        int sib = myKB.nextInt();
        String siblingsNames[] = new String[sib];

        for (int i = 0; i < siblingsNames.length; i++) {
            System.out.println("Please enter the names of the siblings");
            String onlyLetters = myKB.next();
            while (onlyLetters.matches(".*[0-9]+.*")) {
                System.out.println("Invalid, names only. Input a name.");
                onlyLetters = myKB.next();
            }

            siblingsNames[i] = onlyLetters;
        }

        System.out.println("These are the sibling names: ");
        for (int i = siblingsNames.length - 1; i >= 0; i--) {
            System.out.println(siblingsNames[i]);
        }

    }

}
