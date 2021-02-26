# Ejemplo para creación de librería

### Creacion de la librería jarfile
En el directorio del proyecto, ejecuta estos comandos PS
```bash
rm bin -r -fo
rm javaLib.jar 
mkdir bin
javac -d bin src\aritmetica\*.java 
cd bin
jar cfe javaLib.jar -C *
move javaLib.jar .. -fo
cd ..
rm bin -r -fo
jar tvf javaLib.jar
```

Se pued crear automaticamente desde los comandos del proyecto pero automaticamente añade todo los que se encuentra bajo `src` 

### Plantilla JAVA par JUnit5

Plantilla para MSCode.
```java
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
```