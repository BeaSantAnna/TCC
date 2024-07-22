package com.tcc.orcamentos.service;

import java.util.List;
import com.tcc.orcamentos.entity.Solicitacao;

public interface SolicitacaoService {
	
	Solicitacao save(Solicitacao solicitacao);

	Solicitacao findById(Long id);

	Solicitacao update(Long id, Solicitacao solicitacao);

	void delete(Long id);

	List<Solicitacao> findAll();

	List<Solicitacao> findPendentes();

	List<Solicitacao> findEncerradas();
}
