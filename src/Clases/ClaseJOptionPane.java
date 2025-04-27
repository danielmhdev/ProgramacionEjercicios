package Clases;

import javax.swing.*;


public class ClaseJOptionPane {
    public static void main(String[] args) {

        // Como el método_de clase showInputDialog es estático debemos nombrar la clase delante. El resultado se almacenará en la variable de tipo String nombre_usuario.
        String nombre_usuario1 = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String edad = JOptionPane.showInputDialog("¿Cuál es tu edad?"); // En este caso la edad será un valor de tipo String"".
        System.out.println("Tu nombre es: " + nombre_usuario1 + " y tienes: " + (edad+1) + "años"); // Veremos que la edad se suma mal.

        /////////////// Como convertir un String a un int////////////

        String nombre_usuario2 = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String edad2 = JOptionPane.showInputDialog("¿Cuál es tu edad?"); // Si queremos hacer operaciones matemáticas debemos cambiarlo a int.
        int edadNumerica =Integer.parseInt(edad2); // // Convertimos mediante la clase Integer usando el método_parseInt() String a int. Es estática así que tenemos que llamar al método_usando la clase.

        System.out.println("Tu nombre es: " + nombre_usuario2 + " y tienes: " + (edadNumerica+1) + "años");


        // Más sencillo, usando solo una variable para la edad.
        String nombre_usuario3 = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu edad?"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu salario?"));
        System.out.println("Tu nombre es: " + nombre_usuario3 + " y tienes: " + (edad3+1) + "años, y ganas:" + salario);






    }
}
