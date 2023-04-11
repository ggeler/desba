package ar.desba;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactorialTests {

	@Test
	public void PrueboFactorialRecursivo0Equals1() {
		var fact = new Factorial();
		assertThat(fact.factorialRecursivo(0)).isEqualTo(1L);
	}
	
	@Test
	public void PrueboFactorialRecursivo1Equals1() {
		var fact = new Factorial();
		assertThat(fact.factorialRecursivo(1)).isEqualTo(1L);
	}
	
	@Test
	public void PrueboFactorialRecursivo5Equals120() {
		var fact = new Factorial();
		assertThat(fact.factorialRecursivo(5)).isEqualTo(120L);
	}
	
	@Test
	public void PrueboFactorialRecursivo10Equals3628800() {
		var fact = new Factorial();
		assertThat(fact.factorialRecursivo(10)).isEqualTo(3628800L);
	}
}
