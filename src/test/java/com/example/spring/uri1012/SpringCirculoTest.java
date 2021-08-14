package com.example.spring.uri1012;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc

class SpringCirculoTest {


	@Autowired
	private MockMvc mvc;

	@Test
	public void getArea() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/circulo/")
				.param("raio", "2"))
				.andExpect(status().isOk())
				.andExpect(content().string("Calculo Circulo : 12.56636"));
	}

}
