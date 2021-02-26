package app;

import calculos.*;
import ui.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, MVC!");
        // String dir = System.getProperty("user.dir");
        // System.out.println("Estás corriendo en " + dir);

        Calculadora sistema = new Calculadora();

        // MVC en modo ventana
        System.out.println("MVC Window");
        CtrlWindow ctrlw = new CtrlWindow(sistema);
        ViewWindow view = new ViewWindow(ctrlw);
        view.show();

        // MVC en modo terminal
        System.out.println("MVC Consola");
        ViewTerminal viewTerminal = new ViewTerminal();
        CtrlTerminal ctrlt = new CtrlTerminal(sistema, viewTerminal);
        ctrlt.run();

    }
}