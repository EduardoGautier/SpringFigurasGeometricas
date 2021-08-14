package com.example.spring.uri1012;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Retangulo;

public class RetanguloTest {
	@Test
	public void testOne() {
		
		Retangulo newRetangle = new Retangulo(4, 8);

		double expected = 32.0000;
		double actual = newRetangle.getArea();

		assertEquals(expected, actual, 0.0001);
	}

}
