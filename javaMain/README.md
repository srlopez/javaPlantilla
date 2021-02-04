# Plantilla JAVA par JUnit5

Plantilla para MSCode.

Incluye la librería junit en lib.
Incluye una plantilla de test para unas clase genéricas Calculadora 

para 1DAW3 en Plaiaundi


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/* PLANTILLAS DE TESTS
@Test
@DisplayName("")
void test() {
	fail("Not yet implemented");
	//assertEquals(0, 0, "Mensaje");
	//assertAll("Mensaje TODOS",
	// () -> assertEquals( 0,0, "Mensaje 1"),
	// () -> assertEquals( 0,0, "Mensaje 2")
	// );
}

@BeforeAll
static void initAll() {
}

@BeforeEach
void init() {
}

@Test
@Disabled("este tests no se ejecuta")
void skippedTest() {
	// not executed
}

@AfterEach
void tearDown() {
}

@AfterAll
static void tearDownAll() {
}

@Nested
class TestsAgrupados {
}
*/