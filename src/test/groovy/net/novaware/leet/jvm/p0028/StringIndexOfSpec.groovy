package net.novaware.leet.jvm.p0028

import spock.lang.Specification

class StringIndexOfSpec extends Specification {

    def "should pass test cases"() {
        expect:
        index == new StringIndexOf.Solution().strStr(haystack, needle)

        where:
        haystack    | needle    || index
        "a"         | "b"       || -1
        "a"         | "a"       || 0
        "a"         | "ab"      || -1
        "sadbutsad" | "sad"     || 0
        "leetcode"  | "leeto"   || -1
    }
}
