package com.tcc.orcamentos.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Orcamento;
import com.tcc.orcamentos.repository.OrcamentoRepository;
import com.tcc.orcamentos.service.OrcamentoService;

@Service
public class OrcamentoServiceImpl implements OrcamentoService{
	
	@Autowired
	private OrcamentoRepository orcamentoRepository;

	@Override
	public Orcamento save(Orcamento orcamento) {
		return orcamentoRepository.save(orcamento);
	}

	@Override
	public Orcamento findById(Long id) {
		return orcamentoRepository.findById(id).orElse(null);
	}

	@Override
	public Orcamento update(Long id, Orcamento orcamento) {
		if (orcamentoRepository.existsById(id)) {
			orcamento.setId(id);
			return orcamentoRepository.save(orcamento);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		orcamentoRepository.deleteById(id);
	}

	@Override
	public List<Orcamento> findAll() {
		return orcamentoRepository.findAll();
	}
}
