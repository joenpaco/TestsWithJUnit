package com.joenpaco.miw.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;
	
	@Before
	public void before() {
		user = new User(1, "Jose", "Parico");
	}
	
	@Test
	public void testUserIntStringString() {
		assertEquals(1, user.getNumber());
		assertEquals("Jose", user.getName());
		assertEquals("Parico", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Jose Parico", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", user.initials());
	}

}
