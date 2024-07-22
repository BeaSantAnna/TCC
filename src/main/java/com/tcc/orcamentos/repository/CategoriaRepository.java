package com.tcc.orcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tcc.orcamentos.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
