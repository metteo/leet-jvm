package net.novaware.leet.jvm.p0014;

import java.util.Arrays;

public class LongestCommonPrefix {

    static
    class Solution {
        public String longestCommonPrefix(String[] strings) {
            assert 1 <= strings.length && strings.length <= 200;
            assert Arrays.stream(strings)
                    .mapToInt(String::length)
                    .allMatch(l -> l <= 200);
            assert Arrays.stream(strings)
                    .flatMapToInt(String::chars)
                    .allMatch(c -> Character.isLowerCase((char) c));

            if (strings.length == 1) {
                return strings[0];
            }

            StringBuilder result = new StringBuilder();
            int charIdx = 0;

            while(true) {
                char charVal = '\0';

                for (int i = 0; i < strings.length; ++i) {
                    String string = strings[i];

                    if (string.length() - 1 < charIdx) { // shorter string
                        return result.toString();
                    }

                    char c = string.charAt(charIdx);

                    if (charVal == '\0') { // first letter
                        charVal = c;

                    } else if (charVal != c) { // first mismatch
                        return result.toString();
                    }
                }

                result.append(charVal); // no mismatch
                ++charIdx;
            }
        }
    }
}
