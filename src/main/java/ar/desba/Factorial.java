package ar.desba;

import java.util.HashMap;
import java.util.Map;

public class Factorial {

	private static Map<Integer, Long> memo = new HashMap<>();
/*	
	public long factorial(int n) {
		if (n==0)
			return 1;
		else
			return 0;
	}

	public long factorial(int n) {
		if (n==0 || n==1)
			return 1;
		return 0;
	}
*/
	public long factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
/*	
	public long factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		} else {
			if (memo.containsKey(n)) 
				return memo.get(n);
			else {
				memo.put(n, n * factorialMemo(n-1));
				return memo.get(n);
			}
		}
	}
*/
}
