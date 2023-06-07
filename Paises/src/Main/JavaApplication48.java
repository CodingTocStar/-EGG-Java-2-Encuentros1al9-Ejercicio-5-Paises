/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.ServicioPais;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        ServicioPais servicioPais = new ServicioPais();
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            servicioPais.agregarPais();
            System.out.print("¿Desea agregar otro país? (S/N): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nTodos los países:");
        servicioPais.mostrarPaises();

        System.out.println("\nPaíses ordenados alfabéticamente:");
        servicioPais.mostrarPaisesOrdenados();

        System.out.print("\nIngrese un país para eliminarlo: ");
        String paisEliminar = sc.nextLine();
        servicioPais.eliminarPais(paisEliminar);

        System.out.println("\nPaíses después de la eliminación:");
        servicioPais.mostrarPaises();
    }
}
