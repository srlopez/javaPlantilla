package app;

public class Calculadora {

    public int multiplica(int x, int y) {
        return x * y;
    }

    public Fraccion suma(Fraccion f1, Fraccion f2) {
        int n = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int d = f1.denominador * f2.denominador;
        int mDiv = mcd(n, d);
        return new Fraccion(n / mDiv, d / mDiv);
    }

    // Máximo Común Divisor
    int mcd(int x, int y) {
        while (x != y)
            if (x > y)
                x = x - y;
            else
                y = y - x;
        return x;
    }
}
