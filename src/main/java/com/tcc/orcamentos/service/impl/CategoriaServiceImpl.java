package com.tcc.orcamentos.service.impl;

import com.tcc.orcamentos.entity.Categoria;
import com.tcc.orcamentos.repository.CategoriaRepository;
import com.tcc.orcamentos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
