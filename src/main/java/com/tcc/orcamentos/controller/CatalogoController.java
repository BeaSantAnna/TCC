package com.tcc.orcamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CatalogoController {
	
	@GetMapping("/")
	public String acessarCatalogo() {
		return "catalogo/index";
	}
}
