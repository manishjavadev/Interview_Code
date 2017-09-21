package com.manish.javadev.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MathMeticalHelperTest {
	MathMeticalHelper fixture;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp @Before");
		fixture = new MathMeticalHelper();

	}

	@After
	public void tearDown() throws Exception {
		fixture = null;
		System.out.println("tearDown @After");
	}

	@Test
	public void testAddNumber() {
		int result = fixture.addNumber(3, 4);
		assertEquals("Sum of two  number", result, 7);
	}

	@Test
	public void testDivideNumber() {
		int result = fixture.divideNumber(10, 2);
		assertEquals("Sum of two  number", result, 5);
	}

}
