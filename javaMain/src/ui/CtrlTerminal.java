package ui;

import calculos.*;

public class CtrlTerminal {
    Calculadora sistema;
    ViewTerminal viewTerminal;

    public CtrlTerminal(Calculadora sistema, ViewTerminal viewTerminal) {
        this.sistema = sistema;
        this.viewTerminal = viewTerminal;
    }

    public void run() {
        useCase1(); // Caso de Uso #1
    }

    public void useCase1() {
        // Punto de Entrada al Caso de Uso #1
        Fraccion f1 = viewTerminal.leerFraccion();
        Fraccion f2 = viewTerminal.leerFraccion();
        Fraccion result = sistema.suma(f1, f2);
        viewTerminal.mostrarResult(result);
    }
}
