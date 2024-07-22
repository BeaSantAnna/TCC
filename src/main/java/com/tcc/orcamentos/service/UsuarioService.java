package com.tcc.orcamentos.service;

import java.util.*;
import com.tcc.orcamentos.entity.Usuario;

public interface UsuarioService {
	
	List<Usuario> findAll();

	Usuario findById(Long id);

	Usuario save(Usuario usuario);

	void deleteById(Long id);
}
