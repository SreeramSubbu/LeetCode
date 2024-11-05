package org.challenge

import org.challenge.org.challenge.MajorityElement
import kotlin.test.Test
import kotlin.test.assertEquals

class MajorityElementTest {

    val target = MajorityElement()

    @Test
    fun test1(){
        val nums = intArrayOf(3,2,3)
        val result = target.majorityElement(nums)
        assertEquals(3,result)
    }

    @Test
    fun test2(){
        val nums = intArrayOf(2,2,1,1,1,2,2)
        val result = target.majorityElement(nums)
        assertEquals(2,result)
    }
}