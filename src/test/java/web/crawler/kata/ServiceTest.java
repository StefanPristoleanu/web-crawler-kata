package web.crawler.kata;

import org.junit.jupiter.api.Test;

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
}