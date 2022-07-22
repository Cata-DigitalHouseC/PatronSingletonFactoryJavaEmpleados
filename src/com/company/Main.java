package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Empresa empresa=new Empresa("CZ");
        UnidadTrabajo ut1 = new UnidadSimple();
        UnidadTrabajo ut2 = new UnidadSimple();
        UnidadTrabajo ut3 = new UnidadCombinada();
        cargarDatos(ut1);
        cargarDatos(ut2);
        cargarDatos(ut3);
        try {
            cargarUnidades(ut3,ut1);
            cargarUnidades(ut3,ut2);
        } catch (Exception e) {
            System.out.println("Error al cargar unidad");
        }
        empresa.agregarUnidad(ut1);
        empresa.agregarUnidad(ut2);
        empresa.agregarUnidad(ut3);
        System.out.println(empresa.mostrar());
    }

    public static void cargarDatos(UnidadTrabajo ut)
    {
        Scanner scanner = new Scanner(System.in);
        if(ut instanceof UnidadSimple)
        {
            System.out.print("\nNombre de la Unidad Simple: ");
            ((UnidadSimple)ut).setNombre(scanner.nextLine());
            scanner.nextLine();
            System.out.print("Descripcion de la Unidad Simple: ");
            ((UnidadSimple)ut).setDescripcion(scanner.nextLine());
            scanner.nextLine();
            System.out.print("Cantidad de Personas de la Unidad Simple: ");
            ((UnidadSimple)ut).setCantidadPersonas(scanner.nextInt());
            System.out.print("Monto por persona de la Unidad Simple: ");
            ((UnidadSimple)ut).setMontoPorPersona(scanner.nextDouble());
        }
        if(ut instanceof UnidadCombinada)
        {
            System.out.print("\nNombre de la Unidad Combinada: ");
            ((UnidadCombinada)ut).setNombre(scanner.nextLine());
            scanner.nextLine();
            System.out.print("Factor multiplicador de la Unidad Combinada: ");
            ((UnidadCombinada)ut).setCoeficienteGlobal(scanner.nextDouble());

        }
    }

    public static void cargarUnidades(UnidadTrabajo combinada, UnidadTrabajo unidad) throws Exception {
        if(combinada instanceof UnidadCombinada)
            ((UnidadCombinada)combinada).agregarUnidad(unidad);
        else
            throw new Exception("No se puede cargar unidades en una unidad simple");
    }
}
