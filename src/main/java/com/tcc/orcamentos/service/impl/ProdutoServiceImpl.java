package com.tcc.orcamentos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Produto;
import com.tcc.orcamentos.repository.ProdutoRepository;
import com.tcc.orcamentos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	  @Autowired
	    private ProdutoRepository produtoRepository;

	    @Override
	    public List<Produto> findAll() {
	        return produtoRepository.findAll();
	    }

	    @Override
	    public Produto findById(Long id) {
	        return produtoRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Produto save(Produto produto) {
	        return produtoRepository.save(produto);
	    }

	    @Override
	    public void deleteById(Long id) {
	        produtoRepository.deleteById(id);
	    }
}
