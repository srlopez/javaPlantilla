package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import aritmetica.*;

public class FraccionTest {
    @Test
    @DisplayName("Fraccion basica")
    void ConstructorVacio() {
        // fail("Not yet implemented");
       
        Fraccion f = new Fraccion();
        assertEquals(0, f.numerador);
        assertEquals(1, f.denominador);
    }

    @Test
    @DisplayName("Fraccion de String 3/5")
    void ConstructorDeString35() {
        // fail("Not yet implemented");
       
        Fraccion f = new Fraccion("3/5");
        assertEquals(3, f.numerador);
        assertEquals(5, f.denominador);
    }

    @Test
    @DisplayName("Fraccion de String aa/bb")
    void ConstructorDeStringAABB() {
        // fail("Not yet implemented");
       
        Fraccion f = new Fraccion("aa/bb");
        assertEquals(0, f.numerador);
        assertEquals(1, f.denominador);
    }
}
