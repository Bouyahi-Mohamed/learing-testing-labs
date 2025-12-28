package Lab2;

import java.util.*;

public class Roman {

    public int romanToNum(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = map.get(c);

            if (value < prevValue) {
                sum -= value;
            } else {
                sum += value;
            }

            prevValue = value;
        }

        return sum;
    }

    public static void main(String[] args) {
        Roman r = new Roman();
        System.out.println(r.romanToNum("XLIV"));

    }
}
