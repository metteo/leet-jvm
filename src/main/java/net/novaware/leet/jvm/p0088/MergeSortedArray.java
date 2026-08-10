package net.novaware.leet.jvm.p0088;

import java.util.Arrays;

/**
 * #88 Merge Sorted Array
 *
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">Problem on leetcode.com</a>
 */
public class MergeSortedArray {

    static
    class Solution {
        public void merge(
            int[] nums1, int m,
            int[] nums2, int n
        ) {
            // constraints
            assert nums1.length == m + n;
            assert nums2.length == n;
            assert 0 <= m;
            assert n <= 200;
            assert 1 <= m + n & m + n <= 200;

            int[] nums3 = nums1;

            int idx1 = m - 1;
            int idx2 = n - 1;
            int idx3 = nums3.length - 1;

            while(idx3 >= 0) {
                boolean nums1HasItems = idx1 >= 0;
                boolean nums2HasItems = idx2 >= 0;

                if (nums1HasItems && nums2HasItems) {
                    int num1 = nums1[idx1];
                    int num2 = nums2[idx2];

                    if (num1 >= num2) {
                        int prev = nums3[idx3];
                        nums3[idx3] = nums1[idx1];
                        nums1[idx1] = prev;
                        --idx1;
                    } else {
                        nums3[idx3] = nums2[idx2];
                        --idx2;
                    }

                } else if (nums1HasItems) {
                    nums3[idx3] = nums1[idx1]; // in place
                    --idx1;

                } else if (nums2HasItems) {
                    nums3[idx3] = nums2[idx2];
                    --idx2;
                }

                --idx3;
            }
        }
    }
}
