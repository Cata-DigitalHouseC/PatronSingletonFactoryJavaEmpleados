package com.company;

import java.util.ArrayList;
import java.util.List;

public class UnidadCombinada extends UnidadTrabajo
{
    private double coeficienteGlobal;
    private double MontoMaterial;
    private List<UnidadTrabajo> unidades;

    public UnidadCombinada()
    {
        super();
        unidades = new ArrayList<>();
    }

    public void agregarUnidad(UnidadTrabajo u){}

    @Override
    public double calcularMonto() {
        double sumaMontos=0;
        for(UnidadTrabajo ut: unidades)
            sumaMontos+=ut.calcularMonto();
        return sumaMontos*coeficienteGlobal;
    }

    @Override
    public String mostrar() {
        String cadena="";
        for(UnidadTrabajo ut: unidades)
            cadena+="\nNombre: "+ut.getNombre()+" Monto:"+ut.calcularMonto();
        return null;
    }

    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }
}
