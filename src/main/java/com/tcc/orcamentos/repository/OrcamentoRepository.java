package com.tcc.orcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tcc.orcamentos.entity.Orcamento;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Long>{

}
