package org.challenge.org.challenge

class SumInSortedArray {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var pointer1 = 0
        var pointer2 = numbers.lastIndex
        while (pointer1 < pointer2) {
            val sum = numbers[pointer1] + numbers[pointer2]
            when {
                sum < target -> pointer1++
                sum == target -> return intArrayOf(pointer1 + 1, pointer2 + 1)
                else -> pointer2--
            }
        }
        return intArrayOf()
    }

}