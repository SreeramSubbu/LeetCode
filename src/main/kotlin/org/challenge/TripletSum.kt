package org.challenge.org.challenge

/**
 * Sum of triplets from a given array should be zero
 */
class TripletSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) return emptyList()
        val resp: MutableSet<List<Int>> = mutableSetOf()
        nums.sort()

        for(i in 0..nums.size - 2) {
            var left = i + 1
            var right = nums.size - 1
            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                when {
                    sum == 0 -> resp.add(listOf(nums[i], nums[left++], nums[right--]))
                    sum < 0 -> left++
                    else-> right--
                }
            }
        }
        return resp.toList()
    }
}