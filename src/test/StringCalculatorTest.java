import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void addEmpty() {
        int result = stringCalculator.add("");
        Assertions.assertEquals(0,result);
    }

    @Test
    void addOneNumber() {
        int result = stringCalculator.add("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    void addTwoNumbers() {
        int result = stringCalculator.add("1,2");
        Assertions.assertEquals(3, result);
    }

    @Test
    void addTwoAndTwoNumbersShouldReturn4() {
        int result = stringCalculator.add("2,2");
        Assertions.assertEquals(4, result);
    }

    @Test
    void addThreeNumbersShouldReturn() {
        int result = stringCalculator.add("1,20,3");
        Assertions.assertEquals(24, result);
    }

    @Test
    void addNull() {
        int result = stringCalculator.add(null);
        Assertions.assertEquals(0, result);
    }
}
