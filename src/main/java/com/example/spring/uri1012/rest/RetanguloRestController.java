package com.example.spring.uri1012.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Retangulo;

@RestController
@RequestMapping("/retangulo")
public class RetanguloRestController {
	
	@GetMapping("/")
	public String calculoRetangulo(@RequestParam double base , double altura) {
		Retangulo r1 = new Retangulo(base, altura);
		
		return "Calculo Retangulo : "+r1.getArea();
	}
	
}
