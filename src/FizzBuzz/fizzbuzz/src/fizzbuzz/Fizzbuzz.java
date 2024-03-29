package fizzbuzz;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Fizzbuzz {

	@Test
	@DisplayName ("Tesing FizzBuzz input =1")
	void input1() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("1",fizzBuzz.fizzBuzz(1));
	}

	@Test
	@DisplayName ("Tesing FizzBuzz input =2")
	void input2() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("2",fizzBuzz.fizzBuzz(2));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =3")
	void input3() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("fizz",fizzBuzz.fizzBuzz(3));
	}
		
	@Test
	@DisplayName ("Tesing FizzBuzz input =4")
	void input4() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("4",fizzBuzz.fizzBuzz(4));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =5")
	void input5() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("buzz",fizzBuzz.fizzBuzz(5));
	}
		
	@Test
	@DisplayName ("Tesing FizzBuzz input =6")
	void input6() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("fizz",fizzBuzz.fizzBuzz(6));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =7")
	void input7() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("7",fizzBuzz.fizzBuzz(7));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =8")
	void input8() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("8",fizzBuzz.fizzBuzz(8));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =9")
	void input9() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("fizz",fizzBuzz.fizzBuzz(9));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =10")
	void input10() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("buzz",fizzBuzz.fizzBuzz(10));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =11")
	void input11() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("11",fizzBuzz.fizzBuzz(11));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =12")
	void input12() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("fizz",fizzBuzz.fizzBuzz(12));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =13")
	void input13() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("13",fizzBuzz.fizzBuzz(13));
	}
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =14")
	void input14() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("14",fizzBuzz.fizzBuzz(14));
	}	
	
	@Test
	@DisplayName ("Tesing FizzBuzz input =15")
	void input15() {
		lab9tester fizzBuzz = new lab9tester();		
		assertEquals("fizzbuzz",fizzBuzz.fizzBuzz(15));
	}		
		
	}