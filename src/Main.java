// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner ab = new Scanner(System.in);

            System.out.print("Enter the first number ");
            double num1 = ab.nextDouble();
            System.out.print("Enter the second number ");
            double num2 = ab.nextDouble();

            System.out.println("what to perform");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int myChoice = ab.nextInt();
            double result = 0;
            String operation = "";

            switch (myChoice) {
                case 1:
                    result = num1 + num2;
                    operation = "Addition";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "Subtraction";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "Multiplication";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "Division";
                    } else {
                        System.out.println("Error Cannot divide by zero.");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    System.exit(0);
            }
            System.out.println(operation + " result: " + result);
            ab.close();
        }}
