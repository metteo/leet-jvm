package net.novaware.leet.jvm.p0026

import spock.lang.Specification

class RemoveDupsFromSortedArraySpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn as int[] // keep reference for then block

        when:
        def result = new RemoveDupsFromSortedArray.Solution().removeDuplicates(nums)

        then:
        result == res
        nums.toList().subList(0, result) == numsOut

        where:
        numsIn                   || res | numsOut
        [0]                      || 1   | [0]
        [0, 1]                   || 2   | [0, 1]
        [1, 1, 2]                || 2   | [1, 2]
        [0,0,1,1,1,2,2,3,3,4]    || 5   | [0, 1, 2, 3, 4]
    }
}
