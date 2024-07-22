package com.tcc.orcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tcc.orcamentos.entity.ItensSelecao;

@Repository
public interface ItensSelecaoRepository extends JpaRepository<ItensSelecao, Long>{

}
