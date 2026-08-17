package net.novaware.leet.jvm.p0080

import spock.lang.Specification

class RemoveDupsFromSortedArrayIISpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn as int[] // keep reference for then block

        when:
        def result = new RemoveDupsFromSortedArrayII.Solution().removeDuplicates(nums)

        then:
        result == res
        nums.toList().subList(0, result) == numsOut

        where:
        numsIn                   || res | numsOut
        [0]                      || 1   | [0]
        [0, 1]                   || 2   | [0, 1]
        [0, 0]                   || 2   | [0, 0]
        [0, 0, 0]                || 2   | [0, 0]
        [1,1,1,2,2,3]            || 5   | [1,1,2,2,3]
        [0,0,1,1,1,1,2,3,3]      || 7   | [0,0,1,1,2,3,3]
    }
}
