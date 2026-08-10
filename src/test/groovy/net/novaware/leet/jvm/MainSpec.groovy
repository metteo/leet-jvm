package net.novaware.leet.jvm

import spock.lang.Specification

class MainSpec extends Specification {

    def "should print"() {
        expect:
        println "Hello test!"
    }
}
