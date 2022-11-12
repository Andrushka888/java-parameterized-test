package src.test.java.ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import src.main.java.ru.yandex.praktikum.Calculator;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class CalculatorTest {
        private final int firstNumber;
        private final int secondNumber;
        private final int expected;

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;

    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {1, 9, 19},
                {1, 0, 1},
                {5, 5, 10},
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}