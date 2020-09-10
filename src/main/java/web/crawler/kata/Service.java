package web.crawler.kata;

public class Service {

	//String str
	public String echo() {
		return "Hello World";
	}


	/*
		Method that takes in two params:
		a, b type Integer
		Outputs:
		a ^ b
	 */

	public Integer powerMultiplication(int base, int exponent) {

		int result = base;
		for (int i = 1; i < exponent; i++) {
			result *= base;
		}

		return result;

	}
}
