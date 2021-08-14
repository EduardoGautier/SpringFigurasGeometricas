package com.example.model;
/**
 * 
 * @author Eduardo Jose Gautier
 * 
 */

public class Circulo extends Figura {

	private double raio;

	private static final double PI = 3.14159;

	public Circulo(double raio) {
		super();
		checkValue(raio);
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return raio * raio * PI;
	}

}
