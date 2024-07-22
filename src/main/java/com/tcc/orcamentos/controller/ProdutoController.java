package com.tcc.orcamentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tcc.orcamentos.entity.Produto;
import com.tcc.orcamentos.repository.ProdutoRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public String listarProdutos(Model model) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtos", produtos);
		return "produtos/index";

	}

	@GetMapping("/novo")
	public String mostrarFormNovoProduto(Model model) {
		model.addAttribute("produto", new Produto());
		return "produtos/form";

	}

	@PostMapping
	public String salvarProduto(Produto produto) {
		produtoRepository.save(produto);
		return "redirect:/produtos";

	}

	@GetMapping("/editar/{id}")
	public String mostrarFormEditarProduto(@PathVariable Long id, Model model) {
		Produto produto = produtoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Produto inválido:" + id));
		model.addAttribute("produto", produto);
		return "produtos/form";

	}

	@PostMapping("/{id}")
	public String atualizarProduto(@PathVariable Long id, Produto produto) {
		produto.setId(id);
		produtoRepository.save(produto);
		return "redirect:/produtos";

	}
	
	@GetMapping("/deletar/{id}")
	public String deletarProduto(@PathVariable Long id) {
		Produto produto = produtoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Produto inválido:" + id));
		produtoRepository.delete(produto);
		return "redirect:/produtos";
	}
}
