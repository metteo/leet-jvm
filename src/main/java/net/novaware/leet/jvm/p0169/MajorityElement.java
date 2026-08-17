package net.novaware.leet.jvm.p0169;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class MajorityElement {

    static
    class Solution {

        public int majorityElement(int[] nums) {
            assert 1 <= nums.length && nums.length <= 5 * Math.pow(10, 4);
            assert Arrays.stream(nums).allMatch(num -> -Math.pow(10, 9) <= num && num <= Math.pow(10, 9));

            Map<Integer, Integer> numCountMap = new HashMap<>();
            int majNum = 0;
            int majCount = 0;

            for (int num : nums) {
                int count = numCountMap.compute(num, (_, v) -> {
                    if (v == null) {
                        v = 0;
                    }

                    return ++v;
                });

                if (count > majCount) {
                    majCount = count;
                    majNum = num;
                }
            }

            assert majCount > Math.floor((double) nums.length / 2);

            return majNum;
        }
    }
}
