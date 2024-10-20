package com.team.MongoDBProject.services;

import com.team.MongoDBProject.documents.Autor;
import com.team.MongoDBProject.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    public List<Autor> getAutores(){
        List<Autor> autores = autorRepository.findAll();
        System.out.println(autores.size());
        return autores;
    }

    public List<Autor> getAutoresDestacados(){
        List<Autor> destacado = new ArrayList<>();
        for(Autor autor: autorRepository.findAll()){
            if(autor.esDestacado())
                destacado.add(autor);
        }
        System.out.println(destacado.size()+" <-- Nro de autores destacados");
        return destacado;
    }


    public void addAutor(Autor autor){
        autorRepository.save(autor);
    }
    public List<Autor> buscarPorNombres(String query){
        return autorRepository.findByNombresRegex(".*" + query + ".*");
    }

}
