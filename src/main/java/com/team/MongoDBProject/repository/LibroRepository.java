package com.team.MongoDBProject.repository;

import com.team.MongoDBProject.documents.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LibroRepository extends MongoRepository<Libro, String> {
    List<Libro> findByNombreRegex(String regex);
}
