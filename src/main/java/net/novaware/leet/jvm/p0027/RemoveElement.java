package net.novaware.leet.jvm.p0027;

import java.util.Arrays;

public class RemoveElement {

    static
    class Solution {
        public int removeElement(int[] nums, int val) {
            // constraints
            assert nums.length <= 100;
            assert Arrays.stream(nums).allMatch(num -> 0 <= num && num <= 50);
            assert 0 <= val && val <= 100;

            int readIdx = 0;
            int writeIdx = 0;

            while (readIdx < nums.length) {
                int curNum = nums[readIdx];

                if (curNum != val) {
                    nums[writeIdx] = curNum;
                    writeIdx++;
                }

                readIdx++;
            }

            return writeIdx;
        }
    }
}
