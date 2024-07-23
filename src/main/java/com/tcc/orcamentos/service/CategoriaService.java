package com.tcc.orcamentos.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Categoria;

public interface CategoriaService {

	List<Categoria> getAllCategoria();

	void saveCategoria(Categoria categoria);

	Categoria getCategoriaById(long id);

	void deleteCategoriaById(long id);
}
