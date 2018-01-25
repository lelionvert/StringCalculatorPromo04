public class StringCalculator {
    public int add(String input) {
        if(input.length()<1){
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
