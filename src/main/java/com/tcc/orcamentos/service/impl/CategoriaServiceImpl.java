package com.tcc.orcamentos.service.impl;

import com.tcc.orcamentos.entity.Categoria;
import com.tcc.orcamentos.repository.CategoriaRepository;
import com.tcc.orcamentos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> getAllCategoria() {
		return categoriaRepository.findAll();
	}

	@Override
	public void saveCategoria(Categoria categoria) {
		this.categoriaRepository.save(categoria);
	}

	@Override
	public Categoria getCategoriaById(long id) {
		Optional<Categoria> optional = categoriaRepository.findById(id);
		Categoria categoria = null;
		if (optional.isPresent()) {
			categoria = optional.get();
		} else {
			throw new RuntimeException(" Categoria não encontrada por ID :: " + id);
		}
		return categoria;
	}

	@Override
	public void deleteCategoriaById(long id) {
		this.categoriaRepository.deleteById(id);
	}
}
