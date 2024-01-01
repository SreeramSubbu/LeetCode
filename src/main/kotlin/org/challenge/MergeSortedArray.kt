package org.challenge

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var index1 = m - 1  //Index of Last non-zero element
        var index2 = n - 1 // Merge from last to first to avoid shifting elements
        var combinedIndex = m + n - 1

        while (index2 > -1) { // Run until all elements in second array are merged in
            if (index1 > -1 && nums1[index1] > nums2[index2]) { // Element in array 1 is greater
                nums1[combinedIndex--] = nums1[index1--]

            } else { // Element in second array is greater
                nums1[combinedIndex--] = nums2[index2--]
            }
        }
    }


}