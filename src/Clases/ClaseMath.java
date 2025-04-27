package Clases;

public class ClaseMath {
    public static void main(String[] args) {
        int raiz = (int)Math.sqrt(9); // Conversión implicita con(int).Math.sqrt, dado que la clase Math usa doubles.
        System.out.println(raiz);
        double raiz1 = Math.sqrt(9);
        System.out.println(raiz1);

        double cubo = (long)Math.pow(5,5.5);
        System.out.println(cubo);

        double aleatorio = Math.random()*100; // Genera un número aleatorio double comprendido entre 0-1
        System.out.println(aleatorio);

        float redondeo = Math.round((Math.random()*100)); // En este caso el método_round nos pide un float si queremos almacenar int.
        // Dado que no permite convertir un long a un int. Estamos usando un double dado que Math.random * 100 es un número double.
        System.out.println(redondeo);

        String saludo = "Hola Mundo";
        System.out.println(saludo);
        saludo = "Hola caracola";
        System.out.println(saludo);

        int absoluto = Math.abs (-45);
        System.out.println(absoluto); // Output: 45.

        int mayor = Math.max(4,6);
        System.out.println(mayor);

    }
}
