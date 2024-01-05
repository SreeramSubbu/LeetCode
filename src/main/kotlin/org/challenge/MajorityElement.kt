package org.challenge.org.challenge

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy { it }.maxBy { it.value.size }.key
    }
}