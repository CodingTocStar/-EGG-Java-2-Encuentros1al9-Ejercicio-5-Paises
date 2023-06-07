/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioPais {

    private Set<Pais> paises = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    public void agregarPais() {
        System.out.print("Ingrese el nombre del país: ");
        String nombre = sc.nextLine();
        paises.add(new Pais(nombre));
    }

    public void mostrarPaises() {
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
    }

    public void mostrarPaisesOrdenados() {
        List<Pais> listaPaises = new ArrayList<>(paises);
        listaPaises.sort(Comparator.comparing(Pais::getNombre));
        for (Pais pais : listaPaises) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais(String nombre) {
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais pais = it.next();
            if (pais.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                System.out.println("El país " + nombre + " ha sido eliminado.");
                return;
            }
        }
        System.out.println("El país " + nombre + " no se encontró en el conjunto.");
    }
}
