package ui;
import app.Fraccion;

import java.util.Scanner;
import core.MiUtil;


public class ViewTerminal {
    Scanner input = new Scanner(System.in);

    String leerFraccionString() {
        System.out.print("Indica una fracción (0/1): ");
        return input.next();
    }

    public Fraccion leerFraccion() {
        Fraccion f = new Fraccion(leerFraccionString());
        //System.out.println(f);
        return f;
    }

    void mostrarResult(Fraccion result){
        //System.out.println(result);
        MiUtil mu = new MiUtil();
        System.out.println(mu.unSaludo(result.toString()));
    }
}
