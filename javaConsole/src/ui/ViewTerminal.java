package ui;

import aritmetica.Fraccion;

import java.util.Scanner;

public class ViewTerminal {
    Scanner input = new Scanner(System.in);

    String leerFraccionString() {
        System.out.print("Indica una fracción (0/1): ");
        return input.next();
    }

    public Fraccion leerFraccion() {
        Fraccion f = new Fraccion(leerFraccionString());
        // System.out.println(f);
        return f;
    }

    void mostrarResultado(Fraccion result) {
        // System.out.println(result);
        System.out.println("Suma: " + result.toString());
    }

    // MENU
    public char mostrarMenu() {
        System.out.println(" MENU");
        System.out.println(" 1.- Sumar dos fracciones");
        System.out.println(" 2.- Otro UC");
        System.out.println(" F.- FIN");
        return input.next().toUpperCase().charAt(0);
    }
}
