package net.novaware.leet.jvm.p0012;

public class IntegerToRoman {

    static
    class Solution {
        public static final int[] SUBS =
                { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        public static final String[] NUMERALS =
                { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        static {
            if (SUBS.length != NUMERALS.length) {
                throw new IllegalStateException("length mismatch");
            }
        }

        public String intToRoman(int num) {
            assert 1 <= num && num <= 3999;

            StringBuilder result = new StringBuilder();

            int subIdx = 0;

            while (num > 0) {
                int sub = SUBS[subIdx];

                if (num >= sub) {
                    result.append(NUMERALS[subIdx]);
                    num -= sub;
                } else {
                    subIdx++;
                }
            }

            return result.toString();
        }
    }
}
