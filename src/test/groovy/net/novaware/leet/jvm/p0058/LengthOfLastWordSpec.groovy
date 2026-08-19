package net.novaware.leet.jvm.p0058

import spock.lang.Specification

class LengthOfLastWordSpec extends Specification {

    def "should pass test cases"() {
        expect:
        length == new LengthOfLastWord.Solution().lengthOfLastWord(words)

        where:
        words                         || length
        "l"                           || 1
        "word"                        || 4
        " word "                      || 4
        "Hello World"                 || 5
        "   fly me   to   the moon  " || 4
        "luffy is still joyboy"       || 6
    }
}
