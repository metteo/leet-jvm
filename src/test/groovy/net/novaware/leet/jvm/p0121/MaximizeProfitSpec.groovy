package net.novaware.leet.jvm.p0121

import spock.lang.Specification

class MaximizeProfitSpec extends Specification {

    def "should pass test cases"() {
        when:
        int result = new MaximizeProfit.Solution().maxProfit(prices as int[])

        then:
        result == profit

        where:
        prices        || profit
        [0]           || 0
        [1]           || 0
        [1, 0]        || 0
        [0, 1]        || 1
        [7,1,5,3,6,4] || 5
        [7,6,4,3,1]   || 0
        [2,7,1,4]     || 5
    }
}
