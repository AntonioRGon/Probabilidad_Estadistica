package Conjuntos;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> conjuntoA = new HashSet<>();
        Set<Integer> conjuntoB = new HashSet<>();

        // Ingreso de elementos para el conjunto A
        System.out.println("Ingrese los elementos del Conjunto A (ingrese -1 para terminar):");
        while (true) {
            try {
                int elemento = scanner.nextInt();
                if (elemento == -1) break;
                conjuntoA.add(elemento);
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un numero valido.");
                scanner.next(); // Limpiar el scanner para evitar el bucle infinito
            }
        }

        // Ingreso de elementos para el conjunto B
        System.out.println("Ingrese los elementos del Conjunto B (ingrese -1 para terminar):");
        while (true) {
            try {
                int elemento = scanner.nextInt();
                if (elemento == -1) break;
                conjuntoB.add(elemento);
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un numero valido.");
                scanner.next(); // Limpiar el scanner para evitar el bucle infinito
            }
        }

        // Menu de operaciones
        while (true) {
            System.out.println("\nSeleccione una operacion:");
            System.out.println("1. Union");
            System.out.println("2. Interseccion");
            System.out.println("3. Salir");
            
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        Set<Integer> union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        System.out.println("Union: " + union);
                    }

                    case 2 -> {
                        Set<Integer> interseccion = new HashSet<>(conjuntoA);
                        interseccion.retainAll(conjuntoB);
                        System.out.println("Interseccion: " + interseccion);
                    }

                    case 3 -> {
                        System.out.println("Saliendo...");
                        return;
                    }

                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese una opcion valida.");
                scanner.next(); // Limpiar el scanner para evitar errores
            }
        }
    }
}
