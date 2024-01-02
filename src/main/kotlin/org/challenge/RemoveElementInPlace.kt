package org.challenge.org.challenge

class RemoveElementInPlace {

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     */
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var lastValidElement = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[lastValidElement] = nums[i]
                lastValidElement++
            }
        }
        return lastValidElement
    }

}