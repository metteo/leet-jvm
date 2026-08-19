package net.novaware.leet.jvm.p0026;

import java.util.Arrays;

public class RemoveDupsFromSortedArray {

    static
    class Solution {
        public int removeDuplicates(int[] nums) {
            // constraints (might be slow)
            assert 1 <= nums.length && nums.length <= 3 * Math.pow(10, 4);
            assert Arrays.stream(nums).allMatch(num -> -100 <= num && num <= 100);
            assert Arrays.equals(Arrays.stream(nums).sorted().toArray(), nums);

            int prevVal = nums[0] - 1;
            int readIdx = 0;
            int writeIdx = 0;

            while (readIdx < nums.length) {
                int curVal = nums[readIdx];

                if (curVal != prevVal) {
                    nums[writeIdx] = curVal;
                    writeIdx++;

                    prevVal = curVal;
                }

                readIdx++;
            }

            return writeIdx;
        }
    }
}
