package com.team.MongoDBProject.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "libros")
public class Libro {

    @Id
    private String id; // o ObjectId id;
    private String ISBN;
    private String nombre;
    private String rutaPortada;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int stock;
    private String idioma;
    private int edicion;
    private String genero;
    private double precio;
    private String descripcion; // Corregido

    // Constructor sin argumentos
    public Libro() {
    }

    // Constructor completo (opcional)
    public Libro(String ISBN, String nombre, String rutaPortada, String editorial, LocalDate fechaPublicacion, int stock, String idioma, int edicion, String genero, double precio, String descripcion) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.rutaPortada = rutaPortada;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.stock = stock;
        this.idioma = idioma;
        this.edicion = edicion;
        this.genero = genero;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaPortada() {
        return rutaPortada;
    }

    public void setRutaPortada(String rutaPortada) {
        this.rutaPortada = rutaPortada;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
