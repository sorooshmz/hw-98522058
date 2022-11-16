package com.company;

import java.util.Scanner;

public class Main {


    // this program takes a number of values and shows the average and the top value
    // according to the chosen option
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num; // for holding the number of items
        int chosen; // for saving the entered option by the use

        // taking input from the use until enters the right input
        while(true) {
            System.out.println("enter 1 or 2 : "); // showing the list of options
            System.out.println("1) average");
            System.out.println("2) top value");
            chosen = Integer.parseInt(scanner.nextLine());
            if (chosen != 1 && chosen != 2) {
                System.out.println("Wront input!");
            }
            else {
                break;
            }
        }


        
    }
}
