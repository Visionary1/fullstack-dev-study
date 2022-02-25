package variable_ex;

import java.util.Scanner;

public class Day11_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Type a number : ");
        //int number = scan.nextInt();
        // if (number == 1) {
        //     System.out.println("number is 1");
        // } else if (number == 2) {
        //     System.out.println("number is 2");
        // } else {
        //     System.out.println("number is not 1 or 2");
        // }

        // switch (number) {
        //     case 1:
        //     case 2:
        //     case 3: System.out.println("number is 1 ~ 3");
        //         break;

        //     default: System.err.println("not not betwen 1 ~ 3");
        //         break;
        // }

        int i = 0;

        while (i < 5) {
            System.out.println("Hello world " + i);
            i += 1;
            // i++;
            // ++i;
        }

        // i++, --i difference

        // int test = 10;
        // System.out.println("i++ " + test++); // data'll be saved after this line
        // System.out.println("--i" + (++test));



        scan.close();


    }
}
