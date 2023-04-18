package ar.desba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesbaApplication.class, args);

		var fib = new Fibonacci();
		var fac = new Factorial();
		//RC2
		int number = 11;
        System.out.println ("Fibonacci Series: First 10 numbers:");
        for (int i = 1; i <= number; i++) 
        {
            System.out.print(fib.fibo(i) + " ");
        }
        System.out.println();
        System.out.println ("Facgorial: First 10 numbers:");
        for (int i = 1; i <= number; i++) 
        {
            System.out.print(fac.factorial(i) + " ");
        }
	}

}
