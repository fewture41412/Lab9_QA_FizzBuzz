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

		
		
	}