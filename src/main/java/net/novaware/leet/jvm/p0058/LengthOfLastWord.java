package net.novaware.leet.jvm.p0058;

public class LengthOfLastWord {

    static
    class Solution {
        public int lengthOfLastWord(String words) {
            // constraints
            assert !words.isEmpty() && words.length() <= Math.pow(10, 4);
            assert words.chars().allMatch(c -> Character.isLetter((char) c) || c == ' ');
            assert words.split(" ").length > 0;

            int length = 0;

            for (int i = words.length() - 1; i >= 0; --i) {
                char c = words.charAt(i);

                if (c == ' ') {
                    if (length > 0) {
                        return length;
                    }
                } else {
                    ++length;
                }
            }

            return length;
        }
    }
}
