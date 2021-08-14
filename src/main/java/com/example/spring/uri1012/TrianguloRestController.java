package com.example.spring.uri1012;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Triangulo;

@RestController
@RequestMapping("/triangulo")
public class TrianguloRestController {
	
	@GetMapping("/")
	public String calculaTriangulo(@RequestParam double base,  double altura) {
		Triangulo tr = new Triangulo(base, altura);
		return "Calculo Triangulo: "+tr.getArea();
	}

}
