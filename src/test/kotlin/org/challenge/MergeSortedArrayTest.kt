package org.challenge

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {
    private val target = MergeSortedArray()

    @Test
    fun test1(){
        val array1 = intArrayOf(1,2,3,0,0,0)
        val array2 = intArrayOf(2,5,6)
        target.merge(array1,3,array2,3)
        assertContentEquals(expected = intArrayOf(1,2,2,3,5,6), actual = array1)
    }

    @Test
    fun test2(){
        val array1 = intArrayOf(0,0,0)
        val array2 = intArrayOf(2,5,6)
        target.merge(array1,0,array2,3)
        assertContentEquals(expected = intArrayOf(2,5,6), actual = array1)
    }
}