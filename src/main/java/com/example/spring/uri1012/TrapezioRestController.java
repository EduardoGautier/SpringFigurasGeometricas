package com.example.spring.uri1012;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Trapezio;

@RestController
@RequestMapping("/trapezio")
public class TrapezioRestController {
	
	@GetMapping("/")
	public Trapezio calculaTrapezio(@RequestParam double base1, double base2, double altura) {
		return new Trapezio(base1, base2, altura);
	}
}
