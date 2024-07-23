package com.tcc.orcamentos.controller;

import com.tcc.orcamentos.entity.Categoria;
import com.tcc.orcamentos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/home")
	public String viewHomePage(Model model) {
		model.addAttribute("listCategorias", categoriaService.getAllCategoria());
		return "index";
	}

	@GetMapping("/showNewCategoriaForm")
	public String showNewCategoriaForm(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		return "new_categoria";
	}

	@PostMapping("/saveCategoria")
	public String saveEmployee(@ModelAttribute("categoria") Categoria categoria) {
		categoriaService.saveCategoria(categoria);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Categoria categoria = categoriaService.getCategoriaById(id);
		model.addAttribute("categoria", categoria);
		return "update_categoria";
	}

	@GetMapping("/deleteCategoria/{id}")
	public String deleteCategoria(@PathVariable(value = "id") long id) {
		this.categoriaService.deleteCategoriaById(id);
		return "redirect:/";
	}
}