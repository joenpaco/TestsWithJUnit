package com.joenpaco.miw.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	private Point point;
	
	@Before
	public void before() {
		point = new Point(2, 3);
	}

	@Test
	public void testPointIntInt() {
		assertEquals(2, point.getX());
		assertEquals(3, point.getY());
	}

	@Test
	public void testPointInt() {
		point = new Point(2);
		assertEquals(2, point.getX());
		assertEquals(2, point.getY());
	}

	@Test
	public void testPoint() {
		point = new Point();
		assertEquals(0, point.getX());
		assertEquals(0, point.getY());
	}

	@Test
	public void testModule() {
		assertEquals(3.6055, point.module(), 10e-5);
	}

	@Test
	public void testPhase() {
		assertEquals(0.9828, point.phase(), 10e-5);
	}

	@Test
	public void testTranslateOrigin() {
		point.translateOrigin(new Point(1, 1));
		assertEquals(1, point.getX());
		assertEquals(2, point.getY());
	}

}
