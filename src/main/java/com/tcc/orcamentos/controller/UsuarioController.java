package com.tcc.orcamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tcc.orcamentos.entity.Usuario;
import com.tcc.orcamentos.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/home")
	public String viewHomePage(Model model) {
		model.addAttribute("listUsuarios", usuarioService.getAllUsuarios());
		return "usuarios/index";
	}

	@GetMapping("/showNewUsuarioForm")
	public String showNewUsuarioForm(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "usuarios/new_usuario";
	}

	@PostMapping("/saveUsuario")
	public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "redirect:/home";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Usuario usuario = usuarioService.getUsuarioById(id);
		model.addAttribute("usuario", usuario);
		return "update_usuario";
	}

	@GetMapping("/deleteUsuario/{id}")
	public String deleteUsuario(@PathVariable(value = "id") long id) {
		this.usuarioService.deleteUsuarioById(id);
		return "redirect:/home";
	}
}