package ar.desba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesbaApplication.class, args);

		var fact = new Factorial();
		System.out.println("Factorial recursivo "+fact.factorial(0));
		System.out.println("Factorial recursivo "+fact.factorial(1));
		
		var f2 = new Factorial();
		System.out.println("Factorial recursivo "+f2.factorial(10));

	}

}
