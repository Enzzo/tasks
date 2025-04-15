package ru.vasilev.coderun.solution.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution01 {
	
	public void calculate() {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			String[] parts = reader.readLine().split(" ");
			int[] arr = new int[3];
			
			for(int i = 0; i < 3; ++i) {
				arr[i] = Integer.parseInt(parts[i]);
			}
			
			System.out.println(getMiddleElement(arr));
			
		}catch(IOException ignore) {}
		
	}
	
	public int getMiddleElement(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
}