package com.example.uitarea03.entities;

public class Items {
    private String imagen;
    private String nombre;
    private String apellido;

    public Items(String imagen, String nombre, String apellido) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
