package org.challenge.org.challenge

class QuadrapleSum {

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val set = mutableSetOf<List<Int>>()
        nums.sort()
        for (i in 0..<nums.size - 3) {
            for (j in i + 1..<nums.size - 2) {
                var left = j + 1
                var right = nums.size - 1
                while (left < right) {
                    val sum = try {
                        Math.addExact(Math.addExact(Math.addExact(nums[i], nums[j]),nums[left]),nums[right])
                    }catch (e:Exception){
                        Int.MIN_VALUE
                    }

                    when {
                        sum == target -> set.add(listOf(nums[i], nums[j], nums[left++], nums[right--]))
                        sum < target -> left++
                        else -> right--
                    }
                }
            }
        }
        return set.toList()
    }
}