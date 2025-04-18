package ru.vasilev.kyu07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import ru.vasilev.solution.kyu07.BalancedNumber;

public class BalancedNumberTest {
	@Test
	public void digitsTest() throws Exception {
		Method digitsMethod = BalancedNumber.class.getDeclaredMethod("digits", int.class);
		digitsMethod.setAccessible(true);
		
		int d1 = (int)digitsMethod.invoke(null, 1);
		
		assertEquals(d1, 1);
	}
}
