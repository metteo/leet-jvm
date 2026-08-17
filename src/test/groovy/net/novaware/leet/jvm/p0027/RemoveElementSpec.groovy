package net.novaware.leet.jvm.p0027

import spock.lang.Specification

class RemoveElementSpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn as int[] // keep reference for then block

        when:
        def result = new RemoveElement.Solution().removeElement(nums, val)

        then:
        result == res
        nums.toList().subList(0, result) ==~ numsOut

        where:
        numsIn                   | val || res | numsOut
        []                       | 0   || 0   | []
        [1]                      | 1   || 0   | []
        [1]                      | 2   || 1   | [1]
        [3, 2, 2, 3]             | 3   || 2   | [2, 2]
        [0, 1, 2, 2, 3, 0, 4, 2] | 2   || 5   | [0, 1, 4, 0, 3]
    }
}
