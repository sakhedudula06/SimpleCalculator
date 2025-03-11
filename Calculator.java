/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author kamve
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean keepCalculating = true;

        while (keepCalculating) {
            System.out.println("Enter a number");
            double num1 = myObj.nextDouble();

            myObj.nextLine();

            System.out.println("Math Operator e.g +, -, /, x");
            String myOp = myObj.nextLine();

            System.out.println("Enter a number");
            double num2 = myObj.nextDouble();

            switch (myOp) {
                case "+":
                    System.out.println("The answer is :" + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The answer is :" + (num1 - num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("The answer is :" + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                case "x":
                    System.out.println("The answer is :" + (num1 * num2));
                    break;
                default:
                    System.out.println("Invalid Operator");

            }

            // Ask the user if they want to continue
            System.out.println("Do you want to perform another calculation? (yes/no)");
            myObj.nextLine();
            String response = myObj.nextLine();

            // Check if the user wants to continue
            if (!response.equalsIgnoreCase("yes")) {
                keepCalculating = false;
                System.out.println("Goodbye!");
            }
        }
        myObj.close();
    }
}
