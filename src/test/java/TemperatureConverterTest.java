
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TemperatureConverterTest {

    @Test
    void fahrenheitToCelsiusBasics(){
    TemperatureConverter tc = new TemperatureConverter();

        assertEquals(32.0, tc.celsiusToFahrenheit(0.0), 1e-9);// 1e-9 -> test passes as long as the result is within ±0.000000001 of 32.0.
        assertEquals(100.0, tc.fahrenheitToCelsius(212.0), 1e-9);
        assertEquals(37.0, tc.fahrenheitToCelsius(98.6), 1e-9);

    }

    @Test
    void celsiusToFahrenheitBasics() {
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(32.0, tc.celsiusToFahrenheit(0.0), 1e-9);
        assertEquals(212.0, tc.celsiusToFahrenheit(100.0), 1e-9);
        assertEquals(98.6, tc.celsiusToFahrenheit(37.0), 1e-9);
    }

    @Test
    void isExtremeTemperatureValidation(){
        TemperatureConverter tc = new TemperatureConverter();
        assertFalse(tc.isExtremeTemperature(22));
        assertTrue(tc.isExtremeTemperature(63));
        assertTrue(tc.isExtremeTemperature(-72));

    }
}
