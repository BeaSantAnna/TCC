package com.tcc.orcamentos.controller;

import com.tcc.orcamentos.entity.Categoria;
import com.tcc.orcamentos.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public String listarCategorias(Model model) {
		List<Categoria> categorias = categoriaRepository.findAll();
		model.addAttribute("categorias", categorias);
		return "categorias/index";
	}

	@GetMapping("/novo")
	public String mostrarFormNovoProduto(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "categorias/form";
	}

	@PostMapping
	public String salvarCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
		return "redirect:/categorias";
	}

	@GetMapping("/editar/{id}")
	public String mostrarFormEditarCategoria(@PathVariable Long id, Model model) {
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Produto inválido:" + id));
		model.addAttribute("categoria", categoria);
		return "categorias/form";
	}

	@PostMapping("/{id}")
	public String atualizarCategoria(@PathVariable Long id, Categoria categoria) {
		categoria.setId(id);
		categoriaRepository.save(categoria);
		return "redirect:/categorias";
	}

	@GetMapping("/deletar/{id}")
	public String deletarCategoria(@PathVariable Long id) {
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria inválida:" + id));
		categoriaRepository.delete(categoria);
		return "redirect:/produtos";
	}
}
