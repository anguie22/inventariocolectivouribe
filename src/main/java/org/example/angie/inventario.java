package org.example.angie;

import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
       //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";

        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n*********************");
        System.out.println("******🧥 Uribe APP ******");
        System.out.println("*********************");

        System.out.println("\n👋 Bienvenidos al gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1. 💾 Guardar una prenda en BD");
        System.out.println("2. 📦 Mostrar el inventario de prendas");
        System.out.println("4. 🗑️ Eliminar una prenda del sistema");
        System.out.println("5. ❌ Presiona 5 para SALIR");

        while (menuOption!=5) {
            System.out.println();
        
        }


    }
}
