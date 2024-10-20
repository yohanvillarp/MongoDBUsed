package com.team.MongoDBProject.services;

import com.team.MongoDBProject.documents.Autor;
import com.team.MongoDBProject.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void addAutor(Autor autor){
        autorRepository.save(autor);
    }
    public List<Autor> buscarPorNombres(String query){
        return autorRepository.findByNombresRegex(".*" + query + ".*");
    }

}
