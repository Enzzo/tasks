package ru.vasilev.solution;

public class Clock {
//	Clock shows h hours, m minutes and s seconds after midnight.
//	Your task is to write a function which returns the time since midnight in milliseconds.
	public static int Past(int h, int m, int s) {
		return stmls(mts(htm(h))) + stmls(mts(m)) + stmls(s);
	}
	
	private static int htm(int h) {
		return h * 60;
	}
		private static int mts(int m) {
		return m * 60;
	}
	private static int stmls(int s) {
		return s * 1000;
	}
}
