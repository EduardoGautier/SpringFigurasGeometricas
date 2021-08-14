package com.example.spring.uri1012;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Circulo;

@RestController
@RequestMapping("/circulo")
public class CirculoRestController {

	
	@GetMapping("/")
	public Circulo CalculaArea (@RequestParam double raio) {
		Circulo c = new Circulo(raio);
		
		
		return c ;
		
	}

}
