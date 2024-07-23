package com.tcc.orcamentos.service.impl;

import com.tcc.orcamentos.entity.Usuario;
import com.tcc.orcamentos.repository.UsuarioRepository;
import com.tcc.orcamentos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario getUsuarioById(long id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		Usuario usuario = null;
		if (optional.isPresent()) {
			usuario = optional.get();
		} else {
			throw new RuntimeException("Usuario não encontrado: " + id);
		}
		return usuario;
	}

	@Override
	public void deleteUsuarioById(long id) {
		this.usuarioRepository.deleteById(id);
	}
}
