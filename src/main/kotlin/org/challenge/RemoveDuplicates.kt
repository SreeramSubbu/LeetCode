package org.challenge.org.challenge

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
class RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var lst = 0
        for (i in nums.indices) {
            if (i == 0) {
                nums[lst] = nums[i]
                continue
            }
            if (nums[lst] < nums[i]) {
                nums[++lst] = nums[i]
            }
        }
        return lst+1
    }
}