package com.tcc.orcamentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tcc.orcamentos.entity.Usuario;
import com.tcc.orcamentos.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public String listarProdutos(Model model) {
		List<Usuario> usuario = usuarioRepository.findAll();
		model.addAttribute("usuario", usuario);
		return "usuario/index";
	}
	
	@GetMapping("/novo")
	public String mostrarFormNovaUsuario(Model model) {
		model.addAttribute("Usuario", new Usuario());
		return "usuario/form";
	}

	@PostMapping
	public String salvarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
		return "redirect:/usuarios";
	}

	@GetMapping("/editar/{id}")
	public String mostrarFormEditarUsuario(@PathVariable Long id, Model model) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Produto inválido:" + id));
		model.addAttribute("empresa", usuario);
		return "usuarios/form";
	}

	@PostMapping("/{id}")
	public String atualizarUsuario(@PathVariable Long id, Usuario usuario) {
		usuario.setId(id);
		usuarioRepository.save(usuario);
		return "redirect:/usuarios";
	}

	@GetMapping("/deletar/{id}")
	public String deletarUsuario(@PathVariable Long id) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Usuário inválido:" + id));
		usuarioRepository.delete(usuario);
		return "redirect:/usuarios";
	}
  
}
