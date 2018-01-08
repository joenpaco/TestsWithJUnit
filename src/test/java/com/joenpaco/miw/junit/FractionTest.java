package com.joenpaco.miw.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction fraction;
	
	@Before
	public void before() {
		fraction = new Fraction(4, 2);
	}

	@Test
	public void testFractionIntInt() {
		assertEquals(4, fraction.getNumerator());
		assertEquals(2, fraction.getDenominator());
	}

	@Test
	public void testFraction() {
		fraction = new Fraction();
		assertEquals(1, fraction.getNumerator());
		assertEquals(1, fraction.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(2, fraction.decimal(), 10e-5);
	}

}
