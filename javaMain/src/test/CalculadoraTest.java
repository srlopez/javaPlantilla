package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

class CalculadoraTest {

    @Test
    @DisplayName("La multiplicacion de 3x5 es 15")
    void test3x5() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        int result = calc.multiplica(3, 5);
        // 3 - Aserciones
        assertEquals(15, result, "3x5=15");
    }

    @Test
    @DisplayName("La multiplicacion de 2x4 es 8")
    void test2x4() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        int result = calc.multiplica(2, 4);
        // 3 - Aserciones
        assertEquals(8, result);
    }

    @Test
    @DisplayName("La suma de 5/10 + 3/6 es 48/60")
    void testsumafraccion1() {
        // 1 - preracion del test
        Fraccion f1 = new Fraccion(5, 10);
        Fraccion f2 = new Fraccion(3, 6);
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        Fraccion result = calc.suma(f1, f2);
        // 3 - Aserciones
        assertAll("Validamos numerador y denominador",
        () -> assertEquals(1, result.numerador),
        () -> assertEquals(1, result.denominador)
        );
    }

}