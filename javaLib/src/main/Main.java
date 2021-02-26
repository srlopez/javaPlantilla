package main;

import aritmetica.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!!");

        Calculadora calc = new Calculadora();
        Fraccion f1 = new Fraccion(3,7);
        Fraccion f2 = calc.suma(f1, f1);
        System.out.println(f2);

    }
}