package com.tcc.orcamentos.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Empresa;
import com.tcc.orcamentos.repository.EmpresaRepository;
import com.tcc.orcamentos.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}

	@Override
	public Empresa findById(Long id) {
		return empresaRepository.findById(id).orElse(null);
	}

	@Override
	public Empresa save(Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	@Override
	public void deleteById(Long id) {
		empresaRepository.deleteById(id);
	}
}
