package variable_ex01;

public class Ex02 {

	public static void main(String[] args) {
		// 
		
		int cupNoodle = 850;
		System.out.println("Cup noodle price: " + cupNoodle);
		
//		what if we have three cup noodles ...
		int sum = cupNoodle * 3;
		System.out.println("The price of three cup noodles : " + sum);
		
		
//		changes after buying three cup noodles
		int money = 10000;
		int change = money - sum;
		System.out.println("changes leftover : " + change);
		
//		how many cup noodles can I buy with 5,000 ?
		money = 5000;
		int amount = money / cupNoodle;
		System.out.println("You can buy maximum of " + amount + " cup noodles !");
		
		
//		change v1
		change = money % cupNoodle;
		System.out.println("change : " + change);
		
		
//		change v2
		System.out.println("You are keeping " + (money - amount * cupNoodle) + " as a change");
		
		

	}

}
