package com.revature.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.utils.Calculator;

public class CalcTest {

	private static Calculator<Integer> intCalc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		intCalc = new Calculator<Integer>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addTest() {
		assertTrue("2 + 2 should = 4", intCalc.add(2, 2)==4);
	}

}
