package com.tcc.orcamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdministradorController {

	@GetMapping("/administrativo")
	public String acessarPrincipal() {
		return "administrativo/index";
	}
	
	@GetMapping("/admin")
	public String acessarSecundario() {
		return "administrativo/home";
	}

	@GetMapping("/catalogo")
	public String acessar() {
		return "catalogo/index";
	}
}