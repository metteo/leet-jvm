package net.novaware.leet.jvm.p0027

import spock.lang.Specification

class RemoveElementSpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn;

        when:
        def result = new RemoveElement.Solution().removeElement(nums as int[], val)

        then:
        result == res
        nums.toList().subList(0, result) ==~ numsOut

        where:
        numsIn                   | val || res | numsOut
        [3, 2, 2, 3]             | 3   || 2   | [2, 2]
        [0, 1, 2, 2, 3, 0, 4, 2] | 2   || 5   | [0, 1, 4, 0, 3]
    }
}
