package net.novaware.leet.jvm.p0066;

import java.util.Arrays;

public class PlusOne {

    static
    class Solution {
        public int[] plusOne(int[] digits) {
            assert 1 <= digits.length && digits.length <= 100;
            assert Arrays.stream(digits).allMatch(d -> 0 <= d && d <= 9);
            assert noLeadingZeros(digits);

            digits[digits.length - 1]++;

            for (int i = digits.length - 1; i >= 0; --i) {
                int digit = digits[i];

                if (digit >= 10) {
                    int overflow = 10 - digit;
                    digits[i] = overflow;

                    int nextDigitIdx = i - 1;

                    if (nextDigitIdx < 0) { // all 9s case
                        digits = new int[digits.length + 1];
                        digits[0] = 1;

                        return digits;
                    } else {
                        digits[nextDigitIdx]++;
                    }
                }
            }

            return digits;
        }

        private boolean noLeadingZeros(int[] digits) {
            if (digits.length > 1) {
                return digits[0] != 0;
            }

            return true;
        }
    }
}
