package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> mascotas = new ArrayList<>();
    public static void main (String... args){
        System.out.print("Hola! Cuantas mascotas tienes? ");
        int cuantidad = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= cuantidad; i++){
            System.out.printf("Como se llama mascota #%d? ", i);
            mascotas.add(scan.nextLine());
        }
        System.out.print(mascotas);
    }
}
