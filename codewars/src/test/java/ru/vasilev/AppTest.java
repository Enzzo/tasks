package ru.vasilev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import ru.vasilev.solution.Clock;
import ru.vasilev.solution.NewAverage;
import ru.vasilev.solution.kyu06.NotPrimeNumbers;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    public void clockTest(){
		assertEquals(Clock.Past(0, 0, 0), 0);
		assertEquals(Clock.Past(0, 0, 1), 1000);
        assertEquals(Clock.Past(0, 1, 1), 61000);
    }
	
	@Test
    @Order(0)
    void simpleTests() {
        double[] a = new double[] {2};
        assertEquals(2, NewAverage.newAvg(a, 2), "arr = [2, 2], navg = 2");
        a = new double[] {2, 3};
        assertEquals(4, NewAverage.newAvg(a, 3), "arr = [2, 3, 4], navg = 3");
    }
	
	@Test
    @Order(1)
    void sampleTests() {
        double[] a = new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        assertEquals(628, NewAverage.newAvg(a, 90), "arr = [14, 30, 5, 7, 9, 11, 16], navg = 90");
        a = new double[] {14, 30, 5, 7, 9, 11, 15};
        assertEquals(645, NewAverage.newAvg(a, 92), "arr = [14, 30, 5, 7, 9, 11, 15], navg = 92");
        a = new double[] {1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98};
        assertEquals(58430, NewAverage.newAvg(a, 10000.0), "arr = [1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98], navg = 10000.0");
        
	}

    @Test
    @Order(2)
    void testIllegalArgumentException() {
        double[] a = new double[] {14, 30, 5, 7, 9, 11, 15};
        assertThrows(IllegalArgumentException.class, () -> NewAverage.newAvg(a, 2), "arr = [14, 30, 5, 7, 9, 11, 15], navg = 2");
    }
}
