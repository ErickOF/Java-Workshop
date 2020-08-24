package input_output;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Creating a scanner instance
        // System.in is a standard input stream
        // scanner = Scanner(System.in)
        Scanner scanner = new Scanner(System.in);

        // Integers
        System.out.println("Enter an integer number: ");
        int intNumber = scanner.nextInt();
        System.out.println("Number: " + intNumber + "\n");

        // Strings
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hi " + name + "!\n");

        System.out.println("Your name is " + name + " and you're " + intNumber + "yo");
    }
}
