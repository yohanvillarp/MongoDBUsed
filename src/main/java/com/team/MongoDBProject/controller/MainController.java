package com.team.MongoDBProject.controller;

import com.team.MongoDBProject.documents.Autor;
import com.team.MongoDBProject.documents.Libro;
import com.team.MongoDBProject.services.AutorService;
import com.team.MongoDBProject.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private LibroService libroService;
    @Autowired
    private AutorService autorService;

    @GetMapping
    public String listarLibrosDestacados(Model model) {
        List<Libro> librosDestacados = libroService.getLibrosDestacados();
        List<Autor> autoresDestacados = autorService.getAutoresDestacados();

        model.addAttribute("librosDestacados", librosDestacados);
        model.addAttribute("autoresDestacados", autoresDestacados);
        return "main/index";
    }

    @GetMapping("/busquedaAvanzada")
    public String busquedaAvanzada(){
        return "/main/busquedaAvanzada";
    }


}
