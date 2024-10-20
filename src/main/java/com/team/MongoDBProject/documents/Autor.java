package com.team.MongoDBProject.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "autores")
public record Autor(
        @Id String id,
        String nombres,
        String apellidos,
        LocalDate fechaNacimiento,
        String nacionalidad,
        String biografia,
        String rutaPortada,
        String sitioWeb,
        String email
) {}
