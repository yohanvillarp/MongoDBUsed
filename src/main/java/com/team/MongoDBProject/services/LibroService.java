package com.team.MongoDBProject.services;

import com.team.MongoDBProject.documents.Libro;
import com.team.MongoDBProject.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        List<Libro> libros = libroRepository.findAll();
            System.out.println(libros.size());
        return libros;
    }
    public void addLibro(Libro libro){
        libroRepository.save(libro);
    }
    public List<Libro> buscarPorNombre(String query){
        return libroRepository.findByNombreRegex(".*" + query + ".*");
    }
}
