import app.Calculadora;
import app.Fraccion;

import core.MiUtil;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hola estoy usando una Librería!");

        Fraccion f1 = new Fraccion(5, 10);
        Fraccion f2 = new Fraccion(3, 5);
        System.out.println(f1);
        System.out.println(f2);

        Calculadora calc = new Calculadora();
        System.out.println(calc.suma(f1,f2));

        MiUtil mu = new MiUtil();
        System.out.println(mu.unNumero(7,20));
        System.out.println(mu.unNumero(7,20));
        System.out.println(mu.unNumero(7,20));
        System.out.println(mu.unSaludo(" Pedro "));

    }
}