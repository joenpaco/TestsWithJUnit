package com.joenpaco.miw.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection decimalCollection;
	
	@Before
	public void before() {
		decimalCollection = new DecimalCollection();
		decimalCollection.add(2.0);
		decimalCollection.add(-1.0);
		decimalCollection.add(3.0);
		decimalCollection.add(2.0);
	}
	
	@Test
	public void testDecimalCollection() {
		decimalCollection = new DecimalCollection();
		assertEquals(0, decimalCollection.size());
	}

	@Test
	public void testAdd() {
		assertEquals(4, decimalCollection.size());
	}

	@Test
	public void testSum() {
		assertEquals(6, decimalCollection.sum(), 10e-5);
	}

	@Test
	public void testHigher() {
		assertEquals(3, decimalCollection.higher(), 10e-5);
	}

}
