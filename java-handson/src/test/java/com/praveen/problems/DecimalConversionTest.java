package com.praveen.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.praveen.problems.DecimalConversion;

public class DecimalConversionTest {

	/**
	 * +VE: Test decimal to binary
	 */
	@Test
	public void testToBinary() {
		int num = 10;
		DecimalConversion d = new DecimalConversion(num);
		assertEquals("1010", d.toBinary());
	}

	/**
	 * +VE: Test decimal to binary with 0 as input
	 */
	@Test
	public void testToBinaryWithZero() {
		int num = 0;
		DecimalConversion d = new DecimalConversion(num);
		assertEquals("0", d.toBinary());
	}

	/**
	 * +VE: Test decimal to binary with max int value
	 */
	@Test
	public void testToBinaryWithMaxIntValue() {
		int num = Integer.MAX_VALUE;
		DecimalConversion d = new DecimalConversion(num);
		assertEquals("1111111111111111111111111111111", d.toBinary());
	}

	/**
	 * -VE: Test decimal to binary with -ve value
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testToBinaryWithNegagiveValue() {
		int num = -5;
		new DecimalConversion(num);
	}

	/**
	 * -VE: Test decimal to binary with -ve value
	 */
	@Test
	public void testToBinaryWithNegagiveValue2() {
		try {
			int num = -1;
			new DecimalConversion(num);
		} catch (IllegalArgumentException iae) {
			assertEquals("Invalid decimal number \"-1\" received!", iae
					.getMessage());
		}
	}
	
	/**
	 * +VE: Test decimal to octal
	 */
	@Test
	public void testToOctal() {
		int num = 153;
		DecimalConversion d = new DecimalConversion(num);
		assertEquals("231", d.toOctal());
	}
	
	/**
	 * +VE: Test decimal to HexaDeci
	 */
	@Test
	public void testToHexaDeci() {
		int num = 153;
		DecimalConversion d = new DecimalConversion(num);
		assertEquals("99", d.toHexaDeci());
	}
}
