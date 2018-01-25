public class StringCalculator {
    public int add(String input) {
        if (input.length() <= 0)
            return 0;
        String[] split = input.split(",");
        int result = 0;
        for (int i = 0; i < split.length; ++i)
            result += Integer.parseInt(split[i]);
        return result;
    }
}
