package com.team.MongoDBProject.repository;

import com.team.MongoDBProject.documents.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibroRepository extends MongoRepository<Libro, String> {
}
