package com.arun.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arun Pandey
 *
 *	Write a function fib(n) that takes a number as an argument 
 *	and returns the nth number of fibonacci sequence.
 *	
 *	Rule:
 *	First two numbers are 1, 1
 *	And to generate the next number we sum previous two numbers.
 *	
 *	For e.g. -
 *	n = 	 1, 2, 3, 4, 5, 6, 7, 8 ...
 *	fib(n) = 1, 1, 2, 3, 5, 8, 13, 21 ...
 *
 */
public class FibonacciExample {
	
	/**
	 * 1st way of implementation using Brute-force and recursion
	 * 
	 * Limitation: Bigger numbers will call recursively and will take longer,
	 * sometime system may hang.
	 */
	public long bruteforceWay(int n) {
		if(n <= 2) {
			return 1;
		}
		
		return bruteforceWay(n-1) + bruteforceWay(n-2);
	}
	
	/**
	 * 2nd way of implementation using Memoization and recursion
	 * 
	 * This will enhance the performance and optimize the execution
	 */
	public long memoizationWay(int n, Map<Integer, Long> memo){	
		if(memo.containsKey(n)){
			return memo.get(n);
		}
		if(n <= 2) {
			return 1;
		}
		
		long val = memoizationWay(n-1, memo) + memoizationWay(n-2, memo);
		memo.put(n, val);
		return val;
	}
	
	/**
	 * 3rd way of implementation using Tabulation and recursion
	 * 
	 * This will enhance the performance and optimize the execution
	 */
	public long tabulationWay(int n, Map<Integer, Long> memo){	
		if(memo.containsKey(n)){
			return memo.get(n);
		}
		if(n <= 2) {
			return 1;
		}
		
		long val = tabulationWay(n-1, memo) + tabulationWay(n-2, memo);
		memo.put(n, val);
		return val;
	}
	
	public static void main(String args[]) {
		
		FibonacciExample fib = new FibonacciExample();
		
		/**
		 * Brute-force method call
		 */
		System.out.println("Bruteforce call: " + fib.bruteforceWay(3));
		System.out.println("Bruteforce call: " + fib.bruteforceWay(8));
		//this brute-force call may stuck as it takes longer to complete.
		System.out.println("Bruteforce call: " + fib.bruteforceWay(30));
		
		/**
		 * Memoization method call
		*/
		System.out.println("Memoization call: " + fib.memoizationWay(8, new HashMap<Integer, Long>()));
		//this memoization call will be fast as it has been optimized.
		System.out.println("Memoization call: " + fib.memoizationWay(50, new HashMap<Integer, Long>()));
		
		/**
		 * Tabulation method call
		*/
		System.out.println("Tabulation call: " + fib.tabulationWay(8, new HashMap<Integer, Long>()));
		//this tabulation call will be fast as it has been optimized.
		System.out.println("Tabulation call: " + fib.tabulationWay(50, new HashMap<Integer, Long>()));
		
	}

}