package com.example.spring.uri1012;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Trapezio;


/**
 * 
 * @author Eduardo Jose Gautier
 * 
 */

class TrapezioTest {

	@Test
	public void testGetArea() {
		Trapezio t1 = new Trapezio(3.0, 4.0, 5.2);
		double expected = 18.2;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
