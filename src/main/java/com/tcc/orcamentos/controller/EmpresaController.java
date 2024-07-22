package com.tcc.orcamentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tcc.orcamentos.entity.Empresa;
import com.tcc.orcamentos.repository.EmpresaRepository;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@GetMapping
	public String listarProdutos(Model model) {
		List<Empresa> empresa = empresaRepository.findAll();
		model.addAttribute("empresa", empresa);
		return "empresa/index";
	}
	
	@GetMapping("/novo")
	public String mostrarFormNovaEmpresa(Model model) {
		model.addAttribute("Empresa", new Empresa());
		return "empresa/form";
	}

	@PostMapping
	public String salvarEmpresa(Empresa empresa) {
		empresaRepository.save(empresa);
		return "redirect:/empresa";
	}

	@GetMapping("/editar/{id}")
	public String mostrarFormEditarEmpresa(@PathVariable Long id, Model model) {
		Empresa empresa = empresaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Produto inválido:" + id));
		model.addAttribute("empresa", empresa);
		return "empresa/form";
	}

	@PostMapping("/{id}")
	public String atualizarEmpresa(@PathVariable Long id, Empresa empresa) {
		empresa.setId(id);
		empresaRepository.save(empresa);
		return "redirect:/empresa";
	}

	@GetMapping("/deletar/{id}")
	public String deletarEmpresa(@PathVariable Long id) {
		Empresa empresa = empresaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Empresa inválida:" + id));
		empresaRepository.delete(empresa);
		return "redirect:/empresa";
	}
}
