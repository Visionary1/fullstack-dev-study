package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		
//		data type change => casting
		double pi = 3.14;
		int intPi = (int)pi;
	
		System.out.println(intPi);
		System.out.println((double)intPi);
		
		int number = 7;
		double result = number / 2;
		System.out.println(result); // expected 3.5, but got 3.0, how to fix ? 
		
//		1 method
		result = (double)number / 2;
		System.out.println(result);
		
//		2 method
		result = number / 2.0;
		System.out.println(result);
		
//		round
		pi = 3.141523324;
		System.out.println(Math.round(pi)); // round off first decimal, 
		// how to round off from second decimal point ?
		
		
		double roundOff = Math.round(pi * 100.0) / 100.0;
		System.out.println(roundOff);
//		
//		pi = pi * 100;
//		System.out.println(Math.round(pi));
//		
//		pi = pi / 100.0;
//		System.out.println(pi);
		
		
		
		

	}

}
