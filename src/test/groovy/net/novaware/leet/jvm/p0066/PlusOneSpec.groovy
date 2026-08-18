package net.novaware.leet.jvm.p0066

import spock.lang.Specification

class PlusOneSpec extends Specification {

    def "should pass test cases"() {
        when:
        def result = new PlusOne.Solution().plusOne(digitsIn as int[])

        then:
        result.toList() == digitsOut

        where:
        digitsIn            || digitsOut
        [0]                 || [1]
        [9]                 || [1, 0]
        [1, 2, 3]           || [1, 2 ,4]
        [4,3,2,1]           || [4,3,2,2]
    }
}
