package Clases;


public class ClaseString {
    public static void main(String[] args) {
        /*
        String mi_nombre = "Daniel";
        System.out.println(mi_nombre.length());

        System.out.println("La primera letra de mi nombre es: " + mi_nombre.charAt(0));

        System.out.println("La última letra de mi nombre es: " + mi_nombre.charAt(mi_nombre.length()-1));

        */
        String frase = "   Hoy es un estupendo día para salir a pasear   ";
        System.out.println(frase.substring(4, 6)); // Output: es
        System.out.println(frase);

        String nombre1 = "Daniel";
        String nombre2 = "Elena";
        System.out.println(nombre1.equalsIgnoreCase(nombre2));

        System.out.println(frase.strip()); //quita los espacios en blanco a principio y al final de los Strings

        String apellido = "martin"; // Aunque cambie el valor para nosotros, JAVA almacena el primer valor.
        apellido = "juan";
        System.out.println(apellido);




    }
}
