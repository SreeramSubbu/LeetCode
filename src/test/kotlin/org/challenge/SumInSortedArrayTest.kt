package org.challenge

import org.challenge.org.challenge.SumInSortedArray
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SumInSortedArrayTest {

    private val target = SumInSortedArray()

    @Test
    fun test1() {
        val inputArray = intArrayOf(2, 7, 11, 15)
        val sum = 9
        val expected = intArrayOf(1, 2)
        val result = target.twoSum(inputArray, sum)
        assertContentEquals(expected, result)
    }

    @Test
    fun test2() {
        val inputArray = intArrayOf(2, 3, 4)
        val sum = 6
        val expected = intArrayOf(1, 3)
        val result = target.twoSum(inputArray, sum)
        assertContentEquals(expected, result)
    }

    @Test
    fun test3() {
        val inputArray = intArrayOf(-1,0)
        val sum = -1
        val expected = intArrayOf(1,2)
        val result = target.twoSum(inputArray, sum)
        assertContentEquals(expected, result)
    }

}