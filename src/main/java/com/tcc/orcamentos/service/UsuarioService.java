package com.tcc.orcamentos.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.tcc.orcamentos.entity.Usuario;

@Service
public interface UsuarioService {

	List<Usuario> getAllUsuarios();

	void saveUsuario(Usuario usuario);

	Usuario getUsuarioById(long id);

	void deleteUsuarioById(long id);
}
