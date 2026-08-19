package net.novaware.leet.jvm.p0189;

public class RotateArray {

    static
    class Solution {

        public void rotate(int[] nums, int k) {
            assert 1 <= nums.length && nums.length <= Math.pow(10, 5);
            assert 0 <= k && k <= Math.pow(10, 5);

            int length = nums.length;
            int rotation = k % length;

            if (rotation == 0) {
                return; // no need to rotate
            }

            int[] temp = new int[rotation];

            System.arraycopy(nums, length - rotation, temp, 0, rotation);

            System.arraycopy(nums, 0, nums, rotation, length - rotation);
            System.arraycopy(temp, 0, nums, 0, rotation);
        }
    }
}
