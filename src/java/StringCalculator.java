import java.util.Objects;

public class StringCalculator {
    public int add(String input) {
        if(Objects.isNull(input) || input.isEmpty()){
            return 0;
        }
        String[] split = input.split(",");
        int result = 0;
        for (String s: split) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
