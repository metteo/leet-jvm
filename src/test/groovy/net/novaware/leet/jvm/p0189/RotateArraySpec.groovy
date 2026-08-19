package net.novaware.leet.jvm.p0189

import spock.lang.Specification

class RotateArraySpec extends Specification {

    def "should pass test cases"() {
        given:
        int[] nums = numsIn as int[] // keep reference for then block

        when:
        new RotateArray.Solution().rotate(nums, k)

        then:
        nums.toList() == numsOut

        where:
        numsIn          | k || numsOut
        [0]             | 0 || [0]
        [0, 1]          | 1 || [1, 0]
        [0, 1]          | 2 || [0, 1]
        [1,2,3,4,5,6,7] | 3 || [5,6,7,1,2,3,4]
        [-1,-100,3,99]  | 2 || [3,99,-1,-100]
    }

    def "should handle big array"() {
        given:
        def random = new Random()
        int[] nums = random.ints().limit(10000).toArray()

        int k = 56846

        when:
        //def start = System.nanoTime()
        new RotateArray.Solution().rotate(nums, k)
        //def time = System.nanoTime() - start

        then:
        true
        //println "Time: " + time + " ns"
    }
}
