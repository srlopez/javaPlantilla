package app;

import aritmetica.*;
import ui.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // String dir = System.getProperty("user.dir");
        // System.out.println("Estás corriendo en " + dir);

        // MVC en modo terminal
        System.out.println("MVC Consola");
        Calculadora sistema = new Calculadora();
        ViewTerminal viewTerminal = new ViewTerminal();
        CtrlTerminal ctrlt = new CtrlTerminal(sistema, viewTerminal);
        ctrlt.run();
    }
}