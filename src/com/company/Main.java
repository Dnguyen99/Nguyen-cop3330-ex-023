/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    char choice;
    System.out.print("Is the car silent when you turn the key? ");
    choice = scan.next().charAt(0);

    if(choice == 'y') {
        System.out.print("Are the battery terminals corroded? ");
        choice = scan.next().charAt(0);
        if(choice == 'y')
            System.out.println("Clean the terminals and try again.");
        else
            System.out.println("Replace the cables and try again.");
    }
    else {
        System.out.print("Does the car make a slicking noise? ");
        choice = scan.next().charAt(0);
        if(choice == 'y')
            System.out.println("Replace the battery.");
        else {
            System.out.print("Does the car crank up but fail to start? ");
            choice = scan.next().charAt(0);
            if(choice == 'y')
                System.out.println("Check spark plug connection.");
            else {
                System.out.print("Does the engine start and then die? ");
                choice = scan.next().charAt(0);
                if(choice == 'y') {
                    System.out.println("Does your car have fuel injection? ");
                    choice = scan.next().charAt(0);
                    if(choice == 'y')
                        System.out.println("Get it in for service.");
                    else
                        System.out.println("Check to ensure the choke is opening and closing.");
                }
                else {
                    System.out.println("This should not be possible.");
                }
            }
        }
    }
    scan.close();
    }
}
