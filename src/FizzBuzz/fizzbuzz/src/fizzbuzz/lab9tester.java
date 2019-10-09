package fizzbuzz;

import java.util.Scanner;

class lab9tester {
	Scanner keyboardScanner = new Scanner(System.in);
	public String fizzBuzz(int number) {
		String number2 = "" ;
		if (number%3 == 0 && number%5 == 0) {
			number2= "fizz buzz";
			return number2;
		}else if (number%3 == 0) {
			number2= "fizz";
			return number2;			
		}else if (number%5 == 0) {
			number2= "buzz";
			return number2;
		}else {
			return Integer.toString(number);
			
		}
		
		
	}
	
	
}

	