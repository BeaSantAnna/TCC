package com.tcc.orcamentos.service;

import java.util.List;
import com.tcc.orcamentos.entity.Empresa;

public interface EmpresaService {
	
	List<Empresa> findAll();

	Empresa findById(Long id);

	Empresa save(Empresa empresa);

	void deleteById(Long id);
}
