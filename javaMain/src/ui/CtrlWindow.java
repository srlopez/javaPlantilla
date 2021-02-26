package ui;

import calculos.*;

public class CtrlWindow {
    private Calculadora sistema;

	public CtrlWindow(Calculadora sistema) {
        this.sistema = sistema;
	}

    public String useCase1(String f1s, String f2s){
        // Punto de Entrada al Caso de Uso #1
        System.out.println("ctrl "+f1s+ " "+f2s);
        Fraccion f1 = new Fraccion(f1s);
        Fraccion f2 = new Fraccion(f2s);
        Fraccion result = sistema.suma(f1, f2);
        return result.toString();
    }
    
}
