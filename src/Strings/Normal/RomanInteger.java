package Strings.Normal;

//Problem No-13 https://leetcode.com/problems/roman-to-integer/?envType=problem-list-v2&envId=string
public class RomanInteger {
    public int romanToInt(String s) {

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n-1; i++) {
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        sum += getValue(s.charAt(n - 1));

        return sum;
    }
    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
