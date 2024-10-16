package com.team.MongoDBProject.controller;

import com.team.MongoDBProject.documents.Libro;
import com.team.MongoDBProject.repository.LibroRepository;
import com.team.MongoDBProject.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public String listarLibros(Model model) {
        List<Libro> libros = libroService.getLibros();
        System.out.println("Libros cargados: " + libros.size()); // Verifica que este se ejecute
        model.addAttribute("libros", libros);
        return "libros"; // Asegúrate de que este sea el nombre correcto de tu plantilla
    }
}
