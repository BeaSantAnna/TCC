package com.tcc.orcamentos.service.impl;

import com.tcc.orcamentos.entity.Usuario;
import com.tcc.orcamentos.repository.UsuarioRepository;
import com.tcc.orcamentos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario categoria) {
        return usuarioRepository.save(categoria);
    }

    @Override
    public void deleteById(Long id) {
    	usuarioRepository.deleteById(id);
    }
}
