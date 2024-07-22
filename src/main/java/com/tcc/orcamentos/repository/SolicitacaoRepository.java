package com.tcc.orcamentos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tcc.orcamentos.entity.Solicitacao;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long>{
	List<Solicitacao> findByStatus(String status);
}
