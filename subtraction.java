package calculatorr;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("The result of subtraction is: " + (num1 - num2));
    }
}
