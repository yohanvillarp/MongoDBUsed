package com.team.MongoDBProject.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "libros")
public record Libro(
        @Id String id,
        String ISBN,
        String nombre,
        String rutaPortada,
        String editorial,
        LocalDate fechaPublicacion,
        String idioma,
        int edicion,
        String genero,
        double precio,
        String descripcion
) {
}
