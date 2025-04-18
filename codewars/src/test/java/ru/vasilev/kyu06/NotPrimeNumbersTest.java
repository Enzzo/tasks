package ru.vasilev.kyu06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import ru.vasilev.solution.kyu06.NotPrimeNumbers;

public class NotPrimeNumbersTest {
	
	@Test
	@Order(1)
	public void simpleIsPrimesTest() throws Exception{
		Method isPrimeMethod = NotPrimeNumbers.class.getDeclaredMethod("isSimplePrime", int.class);
		isPrimeMethod.setAccessible(true);
		boolean isPrime1 = (boolean) isPrimeMethod.invoke(null, 1);
		boolean isPrime2 = (boolean) isPrimeMethod.invoke(null, 0);
		boolean isPrime3 = (boolean) isPrimeMethod.invoke(null, 3);		
		boolean isPrime4 = (boolean) isPrimeMethod.invoke(null, 7);
		boolean isPrime5 = (boolean) isPrimeMethod.invoke(null, 5);
		boolean isPrime6 = (boolean) isPrimeMethod.invoke(null, 6);
		
		assertFalse(isPrime1);
		assertFalse(isPrime2);
		assertTrue(isPrime3);
		assertTrue(isPrime4);
		assertTrue(isPrime5);
		assertFalse(isPrime6);
	}
	
	@Test
	@Order(2)
	public void simpleFromPrimeTest() throws Exception{
		Method fromPrimesMethod = NotPrimeNumbers.class.getDeclaredMethod("fromPrimes", int.class);
		fromPrimesMethod.setAccessible(true);
		boolean fromPrime1 = (boolean) fromPrimesMethod.invoke(null, 4);
		boolean fromPrime2 = (boolean) fromPrimesMethod.invoke(null, 5);
		boolean fromPrime3 = (boolean) fromPrimesMethod.invoke(null, 9);
		boolean fromPrime4 = (boolean) fromPrimesMethod.invoke(null, 21);
		boolean fromPrime5 = (boolean) fromPrimesMethod.invoke(null, 2257);
		
		assertFalse(fromPrime1);
		assertFalse(fromPrime2);
		assertFalse(fromPrime3);
		assertFalse(fromPrime4);
		assertTrue(fromPrime5);
	}
	
	@Test
	@Order(2)
    public void basicTests() {
        assertEquals(Arrays.asList(22, 25, 27, 32, 33, 35, 52, 55, 57, 72, 75, 77), NotPrimeNumbers.notPrimes(   2,  222));
        assertEquals(Arrays.asList(2722, 2723, 2725, 2727, 2732, 2733, 2735, 2737, 2752, 2755, 2757, 2772, 2773, 2775), NotPrimeNumbers.notPrimes(2700, 3000));
        assertEquals(Arrays.asList(522, 525, 527, 532, 533, 535, 537, 552, 553, 555, 572, 573, 575, 722, 723, 725, 732, 735, 737, 752, 753, 755, 772, 775, 777), NotPrimeNumbers.notPrimes( 500,  999));
        assertEquals(Arrays.asList(2222, 2223, 2225, 2227, 2232, 2233, 2235, 2252, 2253, 2255, 2257, 2272, 2275, 2277, 2322, 2323, 2325, 2327, 2332, 2335, 2337, 2352, 2353, 2355, 2372, 2373, 2375), NotPrimeNumbers.notPrimes( 999, 2500));
    }
}