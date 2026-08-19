package net.novaware.leet.jvm.p0012

import spock.lang.Specification

class IntegerToRomanSpec extends Specification {

    def "should pass test cases"() {
        expect:
        numeral == new IntegerToRoman.Solution().intToRoman(number)

        where:
        numeral   || number
        "I"       || 1
        "V"       || 5
        "X"       || 10
        "L"       || 50
        "C"       || 100
        "D"       || 500
        "M"       || 1000
        "III"     || 3
        "IV"      || 4
        "IX"      || 9
        "XL"      || 40
        "XC"      || 90
        "CD"      || 400
        "CM"      || 900
        "LVIII"   || 58
        "MCMXCIV" || 1994
    }
}
