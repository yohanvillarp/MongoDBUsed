package com.team.MongoDBProject.repository;

import com.team.MongoDBProject.documents.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AutorRepository extends MongoRepository<Autor, String> {
    List<Autor> findByNombresRegex(String regex);
}
