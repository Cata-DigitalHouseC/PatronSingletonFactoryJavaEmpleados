package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    private String nombre;
    private List<UnidadTrabajo> unidadesEmpresa;

    public Empresa(String nombre)
    {
        this.nombre=nombre;
        unidadesEmpresa=new ArrayList<>();
    }

    public void agregarUnidad(UnidadTrabajo ut) {unidadesEmpresa.add(ut);}

    public String mostrar()
    {
        String cadenaUnidades="";
        for(UnidadTrabajo ut: unidadesEmpresa)
            cadenaUnidades+="\nNombre: "+ut.getNombre()+" Monto: "+ut.calcularMonto();
        return cadenaUnidades;
    }
}
