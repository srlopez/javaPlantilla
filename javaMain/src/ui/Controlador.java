package ui;

import app.*;

public class Controlador {
    Calculadora sistema ;
    Terminal viewTerminal;

    public Controlador(Calculadora sistema, Terminal viewTerminal){
        this.sistema = sistema;
        this.viewTerminal = viewTerminal;
    }

    public void run(){
      UC1(); // Caso de Uso #1
    }

    public void UC1(){
        Fraccion f1 = viewTerminal.leerFraccion();
        Fraccion f2 = viewTerminal.leerFraccion();
        Fraccion result = sistema.suma(f1, f2);
        viewTerminal.mostrarResult(result);
    }
}
