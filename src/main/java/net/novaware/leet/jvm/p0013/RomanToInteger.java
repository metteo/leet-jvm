package net.novaware.leet.jvm.p0013;

import java.util.Arrays;

public class RomanToInteger {

    static
    class Solution {

        public static final String SYMBOLS = "IVXLCDM";

        public int romanToInt(String numeral) {
            final int length = numeral.length();

            assert 1 <= length && length <= 15;
            assert Arrays.stream(numeral.split("")).allMatch(SYMBOLS::contains);

            int prevVal = 0;
            int result = 0;

            for (int i = length - 1; i >= 0; --i) {
                char c = numeral.charAt(i);

                int val = switch(c) {
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> 0;
                };

                result += prevVal > val ? -val : val;

                prevVal = val;
            }

            assert 1 <= result && result <= 4000 - 1;

            return result;
        }
    }
}
