import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup before each test");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Cleanup after each test");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(10, 20);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }
}
