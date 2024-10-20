package com.team.MongoDBProject.controller;

import com.team.MongoDBProject.documents.Autor;
import com.team.MongoDBProject.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public String listarAutores(Model model){
        List<Autor> autores = autorService.getAutores();
        model.addAttribute("autores", autores);
        return "main/autores";
    }
    @GetMapping("/add")
    public String addAutores(){
        return "/add/addAutores";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute Autor autor){
        autorService.addAutor(autor);
        return "redirect:/main/autores";
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Autor> buscarAutor(@RequestParam("query") String query){
        return autorService.buscarPorNombres(query);
    }

    

}
