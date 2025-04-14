package ru.vasilev.solution;

import java.util.Arrays;

public class NewAverage {
//	he accounts of the "Fat to Fit Club (FFC)" association are supervised by John 
//	as a volunteered accountant. The association is funded through financial donations 
//	from generous benefactors. 
//	John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15] 
//	He wants to know how much the next benefactor should give to the association 
//	so that the average of the first n + 1 donations should reach an average of 30. 
//	After doing the math he found 149. He thinks that he could have made a mistake.
//
//	Could you help him?
	public static long newAvg(double[] arr, double navg) {
		navg *= (arr.length + 1);
		double sum = Arrays.stream(arr).sum();
		long res = (long)Math.ceil(navg - sum);
		if(res <= 0) {
			throw new IllegalArgumentException();
		}
		return res;
	}
}