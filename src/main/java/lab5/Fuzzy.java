package lab5;

public class Fuzzy {
    public String convert(int i) {
        if(i % 15 == 0){
            return "FizzBuzz";
        }
        if(i % 3 == 0)
            return "Fizz";
        if(i % 5 == 0)
            return "Buzz";

        return String.valueOf(i);
    }

    public String genererchaine(int input1, int input2) {
        String result = convert(input1);
        for (int i = input1+1; i <= input2; i++) {
            result += convert(i);
            }
        return result;

    }
}
