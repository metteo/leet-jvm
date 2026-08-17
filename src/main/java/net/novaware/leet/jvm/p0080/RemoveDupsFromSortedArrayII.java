package net.novaware.leet.jvm.p0080;

import java.util.Arrays;

public class RemoveDupsFromSortedArrayII {

    static
    class Solution {
        public int removeDuplicates(int[] nums) {
            return removeDuplicates(nums, 2); // method call takes time, but it's flexible
        }

        public int removeDuplicates(int[] nums, final int allowedCount) {
            // constraints (might be slow)
            assert 1 <= nums.length && nums.length <= 3 * Math.pow(10, 4);
            assert Arrays.stream(nums).allMatch(num -> -Math.pow(10, 4) <= num && num <= Math.pow(10, 4));
            assert Arrays.equals(Arrays.stream(nums).sorted().toArray(), nums);

            int prevVal = nums[0] - 1;
            int prevCount = 0;

            int readIdx = 0;
            int writeIdx = 0;

            while (readIdx < nums.length) {
                int curVal = nums[readIdx];

                if (curVal != prevVal) {
                    nums[writeIdx] = curVal;
                    writeIdx++;

                    prevVal = curVal;
                    prevCount = 1;
                } else if (prevCount < allowedCount) {
                    nums[writeIdx] = curVal;
                    writeIdx++;

                    prevCount++;
                }

                readIdx++;
            }

            return writeIdx;
        }
    }
}
