package calculos;

public class Fraccion {
    public int numerador = 0;
    public int denominador = 1;

    public Fraccion(){
    }

    public Fraccion(int n, int d){
        this.numerador=n;
        this.denominador=d;
    }

    public Fraccion(String f) {
        String[] enteross = f.split("/");
        if(enteross.length == 2) try {
            numerador = Integer.parseInt(enteross[0].trim());
            denominador = Integer.parseInt(enteross[1].trim());
        } catch (Exception e) {
            return;
        }
    }

    public String toString(){
        return numerador+"/"+denominador;
    }
}
