package org.challenge

import org.challenge.org.challenge.QuadrapleSum
import kotlin.test.Test
import kotlin.test.assertContentEquals

class QuadrapleSumTest {

    private val target = QuadrapleSum()

    @Test
    fun test1() {
        val inputArray = intArrayOf(1, 0, -1, 0, -2, 2)
        val expectedOutput = listOf(listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1))
        val result = target.fourSum(inputArray, 0)
        assertContentEquals(expectedOutput, result)
    }

    @Test
    fun test2() {
        val inputArray = intArrayOf(2,2,2,2,2)
        val expectedOutput = listOf(listOf(2,2,2,2))
        val result = target.fourSum(inputArray, 8)
        assertContentEquals(expectedOutput, result)
    }

    @Test
    fun test3() {
        val inputArray = intArrayOf(1000000000,1000000000,1000000000,1000000000)
        val expectedOutput = emptyList<List<Int>>()
        val result = target.fourSum(inputArray, -294967296)
        assertContentEquals(expectedOutput, result)
    }
}