package org.challenge

import org.challenge.org.challenge.RemoveDuplicates2
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicates2Test {

    val target = RemoveDuplicates2()

    @Test
    fun test1() {
        val input = intArrayOf(1,1,1,2,2,3)
        val k = target.removeDuplicates(input)
       // assertEquals( 5,k)

    }

    @Test
    fun test2() {
        val input = intArrayOf(0,0,1,1,1,1,2,3,3)
        val k = target.removeDuplicates(input)
     //   assertEquals( 7,k)
        input.forEach { println(it) }

    }
}