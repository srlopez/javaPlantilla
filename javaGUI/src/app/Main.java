package app;

import aritmetica.*;
import ui.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // MVC en modo ventana
        System.out.println("MVC Window");
        Calculadora sistema = new Calculadora();
        CtrlWindow ctrlw = new CtrlWindow(sistema);
        ViewWindow view = new ViewWindow(ctrlw);
        view.show();
        System.out.println("fin MVC");
    }
}