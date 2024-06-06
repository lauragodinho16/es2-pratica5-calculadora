import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.somar(2.0, 3.0), 0.001); 
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.subtrair(5.0, 3.0), 0.001); 
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6.0, calc.multiplicar(2.0, 3.0), 0.001); 
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(6.0, 3.0), 0.001); 
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(6.0, 0.0)); 
    }
}
