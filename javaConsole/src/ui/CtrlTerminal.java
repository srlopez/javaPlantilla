package ui;

import aritmetica.*;

public class CtrlTerminal {
    Calculadora sistema;
    ViewTerminal viewTerminal;

    public CtrlTerminal(Calculadora sistema, ViewTerminal viewTerminal) {
        this.sistema = sistema;
        this.viewTerminal = viewTerminal;
    }

    public void run() {
        while (true) {
            char opcion = viewTerminal.mostrarMenu();
            switch (opcion) {
                case '1': {
                    useCase1(); // Caso de Uso #1
                    break;
                }
                case '2': {
                    useCase2();
                    break;
                }               
                case 'F': {
                   return;
                }
                default:
            }
        }
    }

    public void useCase1() {
        // Punto de Entrada al Caso de Uso #1
        Fraccion f1 = viewTerminal.leerFraccion();
        Fraccion f2 = viewTerminal.leerFraccion();
        Fraccion result = sistema.suma(f1, f2);
        viewTerminal.mostrarResultado(result);
    }
    public void useCase2() {
    }

}
