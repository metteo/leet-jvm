package net.novaware.leet.jvm.p0125

import spock.lang.Specification

class ValidPalindromeSpec extends Specification {

    def "should pass test cases"() {
        expect:
        isPalindrome == new ValidPalindrome.Solution().isPalindrome(s)

        where:
        s                                || isPalindrome
        " "                              || true
        "a"                              || true
        "aa"                             || true
        "ab"                             || false
        "aba"                            || true
        "abca"                           || false
        "abba"                           || true
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
    }
}
