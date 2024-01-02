package org.challenge

import org.challenge.org.challenge.RemoveElementInPlace
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class RemoveElementsInPlaceTest {

    val target = RemoveElementInPlace()

    //0,1,
    @Test
    fun test1() {
        val input = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val k = target.removeElement(input, 2)
        Arrays.sort(input, 0, k)
        assertEquals( 5,k)
    }
}