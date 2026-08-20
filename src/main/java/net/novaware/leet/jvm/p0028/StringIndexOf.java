package net.novaware.leet.jvm.p0028;

public class StringIndexOf {

    static
    class Solution {
        public int strStr(String haystack, String needle) {
            final int hLen = haystack.length();
            final int nLen = needle.length();

            assert inRange(hLen, 1, (int) Math.pow(10, 4));
            assert inRange(nLen, 1, (int) Math.pow(10, 4));
            assert haystack.chars().allMatch(c -> Character.isLowerCase((char) c));
            assert needle.chars().allMatch(c -> Character.isLowerCase((char) c));

            for (int i = 0; i <= hLen - nLen; ++i) {
                for (int j = 0; j < nLen; ++j) {
                    char h = haystack.charAt(i + j);
                    char n = needle.charAt(j);

                    if (h != n) { // difference, start again
                       break;
                    }

                    if (j == nLen - 1) { // matched until end
                        return i;
                    }
                }
            }

            return -1;
        }

        static boolean inRange(int length, int minLength, int maxLength) {
            return minLength <= length && length <= maxLength;
        }
    }
}
