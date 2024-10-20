package com.team.MongoDBProject.controller;

import com.team.MongoDBProject.documents.Libro;
import com.team.MongoDBProject.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public String listarLibros(Model model) {
        List<Libro> libros = libroService.getLibros();
        model.addAttribute("libros", libros);
        return "main/libros"; // Asegúrate de que este sea el nombre correcto de tu plantilla
    }

    @GetMapping("/add")
    public String addLibros(){
        return "/add/addLibros";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute Libro libro){
        libroService.addLibro(libro);
        return "redirect:/main/libros";
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Libro> buscarLibro(@RequestParam("query") String query){
        return libroService.buscarPorNombre(query);
    }

    @GetMapping("/details")
    public String detailsLibro(){
        return "/details/detailsLibro";
    }
}
