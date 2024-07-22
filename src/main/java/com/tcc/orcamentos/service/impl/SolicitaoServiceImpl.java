package com.tcc.orcamentos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Solicitacao;
import com.tcc.orcamentos.repository.SolicitacaoRepository;
import com.tcc.orcamentos.service.SolicitacaoService;

@Service
public class SolicitaoServiceImpl implements SolicitacaoService{
	
	@Autowired
	private SolicitacaoRepository solicitacaoRepository;

	@Override
	public Solicitacao save(Solicitacao solicitacao) {
		return solicitacaoRepository.save(solicitacao);
	}

	@Override
	public Solicitacao findById(Long id) {
		return solicitacaoRepository.findById(id).orElse(null);
	}

	@Override
	public Solicitacao update(Long id, Solicitacao solicitacao) {
		if (solicitacaoRepository.existsById(id)) {
			solicitacao.setId(id);
			return solicitacaoRepository.save(solicitacao);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		solicitacaoRepository.deleteById(id);
	}

	@Override
	public List<Solicitacao> findAll() {
		return solicitacaoRepository.findAll();
	}

	@Override
	public List<Solicitacao> findPendentes() {
		return solicitacaoRepository.findByStatus("Pendente");
	}

	@Override
	public List<Solicitacao> findEncerradas() {
		return solicitacaoRepository.findByStatus("Encerrada");
	}
}
