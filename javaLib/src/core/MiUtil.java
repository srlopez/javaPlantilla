package core;

public class MiUtil {
    public int unNumero(int max, int min) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    public String unSaludo(String s) {
        return "Hola '" + s.trim()+"'";
    }
}
