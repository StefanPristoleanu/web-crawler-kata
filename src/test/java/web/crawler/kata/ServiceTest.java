package web.crawler.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

class ServiceTest {

	private final Service testedInstance = new Service();


	@Test
	void testEchoWithHelloWorld() {
		String expected = "Hello World";
		String actual = testedInstance.echo();

		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	void testPowerMultiplicationToThePowerOf1() {
		Integer expectedResult = 3;
		Integer actual = testedInstance.powerMultiplication(3, 1);

		assertThat(actual, is(equalTo(expectedResult)));
	}

	@Test
	void testPowerMultiplicationToThePowerOf3() {
		Integer expectedResult = 343;
		Integer actual = testedInstance.powerMultiplication(7, 3);

		assertThat(actual, is(equalTo(expectedResult)));
	}
}