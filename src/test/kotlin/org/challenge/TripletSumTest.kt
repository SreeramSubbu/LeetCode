package org.challenge

import org.challenge.org.challenge.TripletSum
import kotlin.test.Test
import kotlin.test.assertContentEquals

class TripletSumTest {

    private val target = TripletSum()

    @Test
    fun test1() {
        val inputArray = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expectedOutput = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val result = target.threeSum(inputArray)
        assertContentEquals(expectedOutput, result)
    }

    @Test
    fun test2() {
        val inputArray = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expectedOutput = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val result = target.threeSum(inputArray)
        assertContentEquals(expectedOutput, result)
    }

}