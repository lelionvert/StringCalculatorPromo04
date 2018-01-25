import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void addEmptyString() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        Assertions.assertEquals(0,result);
    }

    @Test
    void addOneNumberInString() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        Assertions.assertEquals(1, result);
    }
}