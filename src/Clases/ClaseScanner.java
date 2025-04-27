package Clases;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = sc.nextLine();

        System.out.println("Introduce tu  edad: ");
        int edad_usuario = sc.nextInt();
        System.out.println("Tienes " + edad_usuario + " años y te llamas " + nombre_usuario);

        sc.close();
        }

    }

