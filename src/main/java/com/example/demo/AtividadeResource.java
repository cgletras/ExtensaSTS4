package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(value="/atividades")
	public class AtividadeResource {
		
		@GetMapping
		public String listar() {
			return "Rest ok";
		}
}
