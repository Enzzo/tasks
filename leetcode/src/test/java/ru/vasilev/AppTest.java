package ru.vasilev;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ru.vasilev.solution.Solution;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private final Solution sln = new Solution();

	/**
	 * /** Rigourous Test :-)
	 */
	@Test
	public void findDisappearedNumbersTest() {
		int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> expect = Arrays.asList(5, 6);
		List<Integer> result = sln.findDisappearedNumbers(a);
		assertEquals(expect, result);
	}

	@Test
	public void sortedSquaresTest() {
		int[] t00 = { 0 };
		int[] exp00 = { 0 };
		int[] res00 = sln.sortedSquares(t00);
		assertArrayEquals(exp00, res00);

		int[] t01 = { 0, 1, 2 };
		int[] exp01 = { 0, 1, 4 };
		int[] res01 = sln.sortedSquares(t01);
		assertArrayEquals(exp01, res01);

		int[] t02 = { -2, -1, 0 };
		int[] exp02 = { 0, 1, 4 };
		int[] res02 = sln.sortedSquares(t02);
		assertArrayEquals(exp02, res02);

		int[] t03 = { -1, 0, 2 };
		int[] exp03 = { 0, 1, 4 };
		int[] res03 = sln.sortedSquares(t03);
		assertArrayEquals(exp03, res03);

		int[] t04 = { -4, -1, 0, 3, 10 };
		int[] exp04 = { 0, 1, 9, 16, 100 };
		int[] res04 = sln.sortedSquares(t04);
		assertArrayEquals(exp04, res04);

		int[] t05 = { -7, -3, 2, 3, 11 };
		int[] exp05 = { 4, 9, 9, 49, 121 };
		int[] res05 = sln.sortedSquares(t05);
		assertArrayEquals(exp05, res05);
	}
}