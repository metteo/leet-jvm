package net.novaware.leet.jvm.p0169

import spock.lang.Specification

class MajorityElementSpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn as int[] // keep reference for then block

        when:
        def result = new MajorityElement.Solution().majorityElement(nums)

        then:
        result == majority

        where:
        numsIn          || majority
        [0]             || 0
        [1]             || 1
        [-1]            || -1
        [3, 2, 3]       || 3
        [2,2,1,1,1,2,2] || 2
        [1,1,1,1,2,2,2] || 1
    }

}
