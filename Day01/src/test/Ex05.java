package test;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type two numbers ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is > " + number2);
        }

        else if (number1 < number2) {
            System.out.println(number1 + " is < " + number2);
        }

        else if (number1 == number2) {
            System.out.println("equal");
        }

        scan.close();
    }
    
}
