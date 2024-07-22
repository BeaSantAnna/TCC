package com.tcc.orcamentos.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Categoria;

@Service
public interface CategoriaService {

	List<Categoria> findAll();

	Categoria findById(Long id);

	Categoria save(Categoria categoria);

	void deleteById(Long id);
}
