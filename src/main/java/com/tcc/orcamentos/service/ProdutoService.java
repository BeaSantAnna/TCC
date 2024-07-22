package com.tcc.orcamentos.service;

import java.util.*;
import com.tcc.orcamentos.entity.*;

public interface ProdutoService {

	List<Produto> findAll();

	Produto findById(Long id);

	Produto save(Produto produto);

	void deleteById(Long id);
}

