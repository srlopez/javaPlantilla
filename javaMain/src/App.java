import app.Calculadora;
import app.Fraccion;
import ui.*;

import core.MiUtil;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hola estoy usando una Librería!");
        String dir = System.getProperty("user.dir");
        System.out.println("Estás corriendo en " + dir);


        Calculadora sistema = new Calculadora();
        Terminal viewTerminal = new Terminal();
        Controlador ctrl = new Controlador(sistema, viewTerminal);
        ctrl.run();
    }
}