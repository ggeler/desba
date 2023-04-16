package ar.desba;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactorialTests {

	@Test
	public void PrueboFactorial0Equals1() {
		var fact = new Factorial();
		assertThat(fact.factorial(0)).isEqualTo(1L);
	}
	
	@Test
	public void PrueboFactorial1Equals1() {
		var fact = new Factorial();
		assertThat(fact.factorial(1)).isEqualTo(1L);
	}
	
	@Test
	public void PrueboFactorial5Equals120() {
		var fact = new Factorial();
		assertThat(fact.factorial(5)).isEqualTo(120L);
	}
	
	@Test
	public void PrueboFactorial10Equals3628800() {
		var fact = new Factorial();
		assertThat(fact.factorial(10)).isEqualTo(3628800L);
	}
}
