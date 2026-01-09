import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static calculadora calculadoraTest;

    @BeforeAll
    public static void setUpClass(){
        calculadoraTest = new calculadora();
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, calculadoraTest.divide(4,2));
        assertEquals(2.5, calculadoraTest.divide(10,4));
        assertEquals(4, calculadoraTest.divide(10,2.5));
        assertEquals(3.2, calculadoraTest.divide(8,2.5));
        assertEquals(0.5, calculadoraTest.divide(2,4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(calculadoraTest.divide(4,2) > 0);
        assertTrue(calculadoraTest.divide(4,-2)< 0);
        assertTrue(calculadoraTest.divide(-4,2) < 0);
        assertTrue(calculadoraTest.divide(-4,-2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            calculadoraTest.divide(5,0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }

    @Test
    @DisplayName("Suma de double")
    void testSumaDouble()throws Exception{
        assertEquals(8,calculadoraTest.suma(5,3));
        assertEquals(5,calculadoraTest.suma(-2,7));
        assertEquals(-10,calculadoraTest.suma(-4,-6));
        assertEquals(9.5,calculadoraTest.suma(0,9.5));
    }

    @Test
    @DisplayName("Resta de double")
    void testRestaDouble()throws Exception{
        assertEquals(7,calculadoraTest.resta(10,3));
        assertEquals(-7,calculadoraTest.resta(5,12));
        assertEquals(5,calculadoraTest.resta(-4,-9));
        assertEquals(-8,calculadoraTest.resta(0,8));
    }

    @Test
    @DisplayName("Multiplicación de double")
    void testMultiplicacionDouble()throws Exception{
        assertEquals(12,calculadoraTest.multiplica(3,4));
        assertEquals(-16,calculadoraTest.multiplica(-2,8));
        assertEquals(25,calculadoraTest.multiplica(-5,-5));
        assertEquals(0,calculadoraTest.multiplica(0.9,0));
    }

    @Test
    @DisplayName("Factorial de numeros enteros")
    void factorialEnteros()throws Exception{
        assertEquals(1,calculadoraTest.factorial(0));
        assertEquals(1,calculadoraTest.factorial(1));
        assertEquals(120,calculadoraTest.factorial(5));
        assertEquals(5040,calculadoraTest.factorial(7));
    }

    @Test
    @DisplayName("Comprobar si es primo")
    void primoEnteros()throws Exception{
        assertTrue(calculadoraTest.esPrimo(2));
        assertFalse(calculadoraTest.esPrimo(15));
        assertTrue(calculadoraTest.esPrimo(17));
        assertTrue(calculadoraTest.esPrimo(1));
    }

    @Test
    @DisplayName("Raiz cuadrada")
    void raizCuadrada()throws Exception{
        assertEquals(1,calculadoraTest.raizCuadrada(1));
        assertEquals(0,calculadoraTest.raizCuadrada(0));
        assertEquals(2,calculadoraTest.raizCuadrada(4));
    }
    @Test
    void testExcepcionClaseNoExiste() {

        Exception thrown = assertThrows(Exception.class, () -> {
            calculadoraTest.raizCuadrada(-1);
        });

        assertEquals("El radicando no puede ser negativo", thrown.getMessage());
    }

}