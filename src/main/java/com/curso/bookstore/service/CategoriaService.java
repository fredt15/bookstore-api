package com.curso.bookstore.service;

import com.curso.bookstore.domain.Categoria;
import com.curso.bookstore.repositories.CategoriaRepository;
import com.curso.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;
    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! ID: "+ id + ", Tipo: "+ Categoria.class.getName()));
    }
    public List<Categoria> finAlld(){
        return repository.findAll();
    }

}
