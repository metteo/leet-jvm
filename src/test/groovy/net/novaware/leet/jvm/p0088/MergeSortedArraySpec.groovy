package net.novaware.leet.jvm.p0088

import spock.lang.Specification

class MergeSortedArraySpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums1 = nums1In
        int[] nums2 = nums2In

        when:
        new MergeSortedArray.Solution().merge(
            nums1, m,
            nums2, n
        )

        then:
        nums1Out == nums1.toList()

        where:
        nums1In            | m | nums2In   | n || nums1Out
        [1, 2, 3, 0, 0, 0] | 3 | [2, 5, 6] | 3 || [1, 2, 2, 3, 5, 6]
        [1]                | 1 | []        | 0 || [1]
        [-1, 1]            | 2 | []        | 0 || [-1, 1]
        [0]                | 0 | [1]       | 1 || [1]
        [0, 0]             | 0 | [-1, 1]   | 2 || [-1, 1]
    }
}
