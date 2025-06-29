package com.learning.program;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AAATest {
	private AAAPattern calculator;
    @Before
    public void setUp() {
        calculator = new AAAPattern();
        System.out.println("Setup completed");
    }
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }
    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }
    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result);
	}

}
