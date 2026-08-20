package net.novaware.leet.jvm.p0125;

public class ValidPalindrome {

    static
    class Solution {
        public boolean isPalindrome(String s) {
            // constraints
            assert !s.isEmpty() && s.length() <= 2 * Math.pow(10, 5);
            assert s.chars().allMatch(Solution::isPrintableAscii);

            String processed = s.toLowerCase()
                    .chars()
                    .filter(c -> Character.isLetter((char) c) || Character.isDigit((char) c))
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            int length = processed.length();
            int half = length / 2; // ignore fraction

            for (int i = 0; i < half; ++i) {
                if (processed.charAt(i) != processed.charAt(length - i - 1)) {
                    return false;
                }
            }

            return true;
        }

        static boolean isPrintableAscii(int c) {
            return 32 <= c && c <= 126;
        }
    }
}
