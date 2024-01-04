package org.challenge

import org.challenge.org.challenge.RemoveDuplicates
import org.challenge.org.challenge.RemoveElementInPlace
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class RemoveDuplicatesTest {

    val target = RemoveDuplicates()

    //0,1,
    @Test
    fun test1() {
        val input = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val k = target.removeDuplicates(input)
        assertEquals( 5,k)
    }

    @Test
    fun test2() {
        val input = intArrayOf(1,1,2)
        val k = target.removeDuplicates(input)
        assertEquals( 2,k)
    }
}