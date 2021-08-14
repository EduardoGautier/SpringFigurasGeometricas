package com.example.spring.uri1012;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Retangulo;

@RestController
@RequestMapping("/retangulo")
public class RetanguloRestController {
	
	@GetMapping("/")
	public Retangulo calculoRetangulo(@RequestParam double base , double altura) {
		return new Retangulo(base, altura);
	}
	
}
