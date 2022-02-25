package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//	    
//	    입력1 : 843
//	    입력2 : 8
		
		
//		ctrl + 1, ctrl + shift + o ---> automatic import
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("Enter price : ");
	    
	    
	    int price = scan.nextInt(); // read user input int
	    //String price = scan.nextLine();  // Read user input
	    
	    System.out.println("price is : " + price);  // Output user input
	    
	    
	    System.out.print("Enter amount : ");
	    int amount = scan.nextInt();
	    int sum = price * amount;
	    
	    System.out.println("Total cost : " + sum);
	    
	    
	    scan.close();
	}

}
