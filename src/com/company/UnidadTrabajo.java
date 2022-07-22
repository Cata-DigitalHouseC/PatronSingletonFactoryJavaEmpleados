package com.company;

public abstract class UnidadTrabajo
{
    private String nombre;
    private String descripcion;

    public abstract double calcularMonto();
    public abstract String mostrar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
