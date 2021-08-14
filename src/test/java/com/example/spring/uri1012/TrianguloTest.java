package com.example.spring.uri1012;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 
 * @author Eduardo Jose Gautier
 * 
 * */

import org.junit.jupiter.api.Test;


import com.example.model.Triangulo;


class TrianguloTest {

	@Test
	public void testOne() {
		Triangulo t1 = new Triangulo(5,2);
		double expected = 6.00;
		double actual = t1.getArea();
		
		assertEquals(expected, actual, 0.01);
	}

}