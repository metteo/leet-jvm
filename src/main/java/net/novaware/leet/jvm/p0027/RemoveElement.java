package net.novaware.leet.jvm.p0027;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveElement {

    static
    class Solution {
        public int removeElement(int[] nums, int val) {
            // constraints
            assert nums.length <= 100;
            assert Arrays.stream(nums).allMatch(num -> 0 <= num && num <= 50);
            assert 0 <= val && val <= 100;

            AtomicInteger left = new AtomicInteger();
            int[] numsOut = Arrays.stream(nums).filter(num -> {
                var noMatch = num != val;
                if (noMatch) { left.incrementAndGet(); }

                return noMatch;
            }).toArray();

            Arrays.fill(nums, -1);
            System.arraycopy(numsOut, 0, nums, 0, numsOut.length);

            return left.get();
        }
    }
}
