package com.example.spring.uri1012;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Quadrado;

@RestController
@RequestMapping("/quadrado")
public class QuadradoRestController {
	
  @GetMapping("/")
  public String calcularQuadrado(@RequestParam double lado){
	  Quadrado q1 = new Quadrado(lado);
	  
	  return "Calculo Quadrado: "+q1.getArea();
  }
  
}
