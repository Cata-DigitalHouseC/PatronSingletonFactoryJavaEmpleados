package com.company;

public class UnidadTrabajoFactory
{
    private static UnidadTrabajoFactory instancia;
    private static final String SIMPLE="Simple";
    private static final String COMBINADA="Combinada";

    private UnidadTrabajoFactory(){}

    public static UnidadTrabajoFactory getInstancia()
    {
        if(instancia==null)
            instancia = new UnidadTrabajoFactory();
        return instancia;
    }

    public UnidadTrabajo crearUnidadTrabajo(String codigo)
    {
        switch(codigo)
        {
            case SIMPLE:
                return new UnidadSimple();
            case COMBINADA:
                return new UnidadCombinada();
        }
        return null;
    }
}
