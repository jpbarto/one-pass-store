package org.r9labs.cloud.java.onepassstore.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.r9labs.cloud.java.onepassstore.data.AccountRecord;

public class TestAccountRecord {
	AccountRecord ar;
	final static String STR = "i am a string";
	
	@Before
	public void setUp() throws Exception {
		ar = new AccountRecord ();
	}

	@After
	public void tearDown() throws Exception {
		ar = null;
	}

	@Test
	public void testGetName() {
		assertNotNull(ar.getName());
	}

	@Test
	public void testSetName() {
		ar.setName(STR);
		assertEquals(ar.getName(), STR);
	}

	@Test
	public void testGetUsername() {
		assertNotNull(ar.getUsername());
	}

	@Test
	public void testSetUsername() {
		ar.setUsername(STR);
		assertEquals(ar.getUsername(), STR);
	}

	@Test
	public void testGetPassword() {
		assertNotNull(ar.getPassword());
	}

	@Test
	public void testSetPassword() {
		ar.setPassword(STR);
		assertEquals(ar.getPassword(), STR);
	}

	@Test
	public void testGetHost() {
		assertNotNull(ar.getHost());
	}

	@Test
	public void testSetHost() {
		ar.setHost(STR);
		assertEquals(ar.getHost(), STR);
	}

	@Test
	public void testGetNote() {
		assertNotNull(ar.getNote());
	}

	@Test
	public void testSetNote() {
		ar.setNote(STR);
		assertEquals(ar.getNote(), STR);
	}

}
