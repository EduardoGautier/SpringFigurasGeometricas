package com.example.spring.uri1012.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Trapezio;

@RestController
@RequestMapping("/trapezio")
public class TrapezioRestController {
	
	@GetMapping("/")
	public String calculaTrapezio(@RequestParam double base1, double base2, double altura) {
		Trapezio t1 = new Trapezio(base1, base2, altura);
		return "Calculo Trapezio: "+t1.getArea();
	}
}
