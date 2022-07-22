package com.company;

public class UnidadSimple extends UnidadTrabajo
{
    private double montoPorPersona;
    private int cantidadPersonas;

    @Override
    public double calcularMonto() {
        if(cantidadPersonas>10)
            montoPorPersona*=1.2;
        return montoPorPersona*cantidadPersonas;
    }

    @Override
    public String mostrar() {
        return "\nNombre: "+getNombre()+" Monto:"+calcularMonto();
    }

    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
