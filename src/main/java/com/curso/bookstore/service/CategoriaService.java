package com.curso.bookstore.service;

import com.curso.bookstore.domain.Categoria;
import com.curso.bookstore.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;
    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
