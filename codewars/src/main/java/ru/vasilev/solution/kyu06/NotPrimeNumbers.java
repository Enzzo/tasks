package ru.vasilev.solution.kyu06;

import java.util.ArrayList;
import java.util.List;

public class NotPrimeNumbers {
	public static List<Integer> notPrimes(int a, int b) {
		List<Integer> res = new ArrayList<>();
		for(int i = a; i < b; ++i) {
			if(fromPrimes(i) && !isPrime(i)) {
				res.add(i);
			}
		}
        return res; // Do your magic!
    }
	
	private static boolean fromPrimes(int v) {
		if(v < 22) {
			return false;
		}
		int x = v;
		while(0 < x) {
			if(!isSimplePrime(x % 10)) {
				return false;
			}
			x /= 10;
		}
		return true;
	}
	
	private static boolean isSimplePrime(int v) {
		if(v == 2 || v == 3 || v == 5 || v == 7) {
			return true;
		}
		return false;
	}
	private static boolean isPrime(int v) {
		if (v <= 1) return false;
	    for (int i = 2; i * i <= v; i++) {
	        if (v % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}