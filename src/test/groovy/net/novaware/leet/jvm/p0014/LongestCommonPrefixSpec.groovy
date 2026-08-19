package net.novaware.leet.jvm.p0014

import spock.lang.Specification

class LongestCommonPrefixSpec extends Specification {

    def "should pass test cases"() {
        expect:
        length == new LongestCommonPrefix.Solution().longestCommonPrefix(strings as String[])

        where:
        strings                    || length
        [""]                       || ""
        ["word"]                   || "word"
        ["", ""]                   || ""
        ["word", ""]               || ""
        ["word", "word"]           || "word"
        ["flower","flow","flight"] || "fl"
        ["dog","racecar","car"]    || ""
    }
}
