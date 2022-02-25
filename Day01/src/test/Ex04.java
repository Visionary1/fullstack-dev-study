package test;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your weight : ");

        int weight = scan.nextInt();

        if (weight < 60) {
            System.out.println("Have some chicken !");
        }
        else if (weight >= 100) {
            System.out.println("start diet ser :)");
        }

        else if (weight == 68) {
            System.out.println("your weight is " + weight);            
        }

        else if (weight != 75) {
            System.out.println("Your weight is not 75");
        }

        scan.close();
    }
    
}
