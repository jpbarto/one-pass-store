package org.r9labs.cloud.java.onepassstore.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.r9labs.cloud.java.onepassstore.rest.ServiceUserController;

public class TestServiceUserController {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUser() {
		assertNotNull(new ServiceUserController().getUserInfo());
	}

}
