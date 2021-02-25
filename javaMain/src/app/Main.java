package app;

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
        Window ventana = new Window(ctrlw);
        ventana.show();

        // MVC en modo terminal
        System.out.println("MVC Consola");
        Terminal viewTerminal = new Terminal();
        CtrlTerminal ctrlt = new CtrlTerminal(sistema, viewTerminal);
        ctrlt.run();

    }
}