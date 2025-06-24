package org.example.juanjosegallego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";
        ArrayList<Object> productos=new ArrayList<>();
        HashMap<String, Object> diccionario =new HashMap<>();


        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n******************");
        System.out.println("***** Uribe APP *****");
        System.out.println("******************");

        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println("Digite una opcion:");
        menuOption=keyEntry.nextInt();



        while(true){
            HashMap<String, Object> diccionario =new HashMap<>();
            try{

                if (menuOption==1) {
                    System.out.println("Registra un producto...");

                    //agregando un elemento a una lista de java
                    // System.out.println("Digita el producto que quieres agregar");
                    //String producto = "";
                    // keyEntry.nextLine();
                    // productos.add(keyEntry.nextLine()) ;

                    //   productos.add("camiseta");
                    //productos.add("pantaloneta");
                    //mostrando una lista
                    //System.out.println(productos);

                    //creando objetos/diccionarios/hashmaps en java



                    //llenando un diccionario//
                    System.out.println("Digita el id del producto:");
                    diccionario.put("Id",keyEntry.nextInt());

                    System.out.println("Digita el precio del producto");
                    diccionario.put("precio",keyEntry.nextInt());

                    System.out.println("Digita el nombre del producto");
                    diccionario.put("nombre",keyEntry.nextInt());
                    System.out.println(diccionario);

                    //llenando una lista con un diccionario
                    productos.add(diccionario);
                }
                else if (menuOption==2) {
                    System.out.println("Mostrando el inventario...");
                    System.out.println(productos);
                }
                else if(menuOption==3){
                    System.out.println("Modificando un producto...");
                }
                else if(menuOption==4) {

                }
                else if(menuOption==5) {
                    System.out.println("Gracias por utilizar nuestra app...");
                    break;
                }
                System.out.println("Ahora dijita otra opcion:");
                menuOption= keyEntry.nextInt();

                 catch(Exception error){
                    System.out.println("OCURRIO UN ERROR");
                }

            }


        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
