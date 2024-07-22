package com.tcc.orcamentos.service;

import java.util.List;
import com.tcc.orcamentos.entity.Orcamento;

public interface OrcamentoService {
	
	Orcamento save(Orcamento orcamento);

	Orcamento findById(Long id);

	Orcamento update(Long id, Orcamento orcamento);

	void delete(Long id);

	List<Orcamento> findAll();
}
