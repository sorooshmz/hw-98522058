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


        // average
        if (chosen == 1) {
            int sum = 0; // holding the sum of items
            System.out.println("Enter the number of items : ");
            num = Integer.parseInt(scanner.nextLine()); // taking the number of items from the use

            // taking the items from the user
            for(int i = 0;i < num;i++) {
                System.out.println("Enter the " + (i + 1) + " value");
                int temp = Integer.parseInt(scanner.nextLine());
                sum += temp;
            }


            // calculating the value
            Double average = Double.valueOf(sum);
            average /= Double.valueOf(num);

            // printing the value
            System.out.println("The average of the numbers : " + average);
        }
    }
}
