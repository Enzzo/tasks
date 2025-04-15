package ru.vasilev.coderun.solution.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Solution01Test {
	private Solution01 sln;
	
	@BeforeEach
	void setUP() {
		sln = new Solution01();
	}
	
	@Test
	@Order(1)
	void simpleTest() {
		int[] a1 = {0, 0, 0};
		assertEquals(0, sln.getMiddleElement(a1), "a1 = {0, 0, 0}");
		
		int[] a2 = {1, 1, 1};
		assertEquals(1, sln.getMiddleElement(a2), "a2 = {1, 1, 1}");
	}
	
	@Test
	@Order(2)
	void nextTest() {
		int[] a1 = {0, 1, 2};
		assertEquals(1, sln.getMiddleElement(a1), "a1 = {0, 1, 2}");
		
		int[] a2 = {-1, -1, 1};
		assertEquals(-1, sln.getMiddleElement(a2), "a2 = {-1, -1, 1}");
	}
}