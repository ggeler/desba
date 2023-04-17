package ar.desba;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FibonacciTests {

	@Test
	public void PrueboFibonacci0Equals0() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 0: "+f.fibo(0));
		assertThat(f.fibo(0)).isEqualTo(0L);
	}
	
	@Test
	public void PrueboFibonacci1Equals1() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 1: "+f.fibo(1));
		assertThat(f.fibo(1)).isEqualTo(1L);
	}

	@Test
	public void PrueboFibonacci2Equals1() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 2: "+f.fibo(2));
		assertThat(f.fibo(2)).isEqualTo(1L);
	}

	@Test
	public void PrueboFibonacci3Equals2() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 3: "+f.fibo(3));
		assertThat(f.fibo(3)).isEqualTo(2L);
	}

	@Test
	public void PrueboFibonacci4Equals3() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 4: "+f.fibo(4));
		assertThat(f.fibo(4)).isEqualTo(3L);
	}

	@Test
	public void PrueboFibonacci5Equals5() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 5: "+f.fibo(5));
		assertThat(f.fibo(5)).isEqualTo(5L);
	}

	@Test
	public void PrueboFibonacci6Equals8() {
		var f = new Fibonacci();
		System.out.println("Fibonacci 6: "+f.fibo(6));
		assertThat(f.fibo(6)).isEqualTo(8L);
	}
}
