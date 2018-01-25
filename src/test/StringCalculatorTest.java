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
    void addEmptyString() {
        int result = stringCalculator.add("");
        Assertions.assertEquals(0,result);
    }

    @Test
    void addOneNumberInString() {
        int result = stringCalculator.add("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    void addTwoNumberInString() {
        int result = stringCalculator.add("1,2");
        Assertions.assertEquals(3, result);
    }

    @Test
    void addNumbersInStringShouldReturn4() {
        int result = stringCalculator.add("2,2");
        Assertions.assertEquals(4, result);
    }
}