package ru.vasilev.solution.kyu07;

public class BalancedNumber {
	public static String balancedNum(long number) {
		return "Do your magic";
	}
	
	private static int digits(long number) {
		int d =0;
		while(0 < number) {
			number /= 10;
			d++;
		}
		return d;
	}
}