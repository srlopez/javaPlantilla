package aritmetica;

public class Fraccion {
    int numerador = 0;
    int denominador = 1;

    /**
     * Default constructor. 
     * Fracción nula 0/1
     */
    public Fraccion() {
    }
    
    /**
     * Constructor indicando el numerador y el denominador
     * @param n 
     * @param d
     */
    public Fraccion(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    /**
     * Constructor indicando un string tipo "5/7"
     * Si el parámetro es incorrecto crea la fracción nula 0/1
     * @param f 
     */
    public Fraccion(String f) {
        String[] enteross = f.split("/");
        if (enteross.length == 2)
            try {
                numerador = Integer.parseInt(enteross[0].trim());
                denominador = Integer.parseInt(enteross[1].trim());
            } catch (Exception e) {
                return;
            }
    }

    /**
     * @return
     */
    public String toString() {
        return numerador + "/" + denominador;
    }
}
