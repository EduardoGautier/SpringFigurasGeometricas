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

class SpringRetanguloTest {


	@Autowired
	private MockMvc mvc;

	@Test
	public void getArea() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/retangulo/")
				.param("base", "5").param("altura", "6"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":30.0}"));
	}

}
