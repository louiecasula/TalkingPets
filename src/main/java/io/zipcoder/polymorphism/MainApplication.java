package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainApplication {
    static Scanner scan = new Scanner(System.in);
    static LinkedHashMap<String, String> mascotas = new LinkedHashMap<>();
    public static void main (String... args){
        System.out.print("Hola! Cuantas mascotas tienes? ");
        int cuantidad = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= cuantidad; i++){
            System.out.printf("Como se llama mascota #%d? ", i);
            String animalCurrente = scan.nextLine();
            mascotas.put(animalCurrente, "");
            System.out.print("Que tipo de animal es? ");
            mascotas.put(animalCurrente, scan.nextLine());
        }
        System.out.print(mascotas);
        // Iterate through keys, instantiate each pet.
//        for (String k: mascotas.keySet()){
//            if (mascotas.get(k).equals("Dog")){
//                Dog
//            }
//        }
        // Print each one's name and what it says.
    }
}
