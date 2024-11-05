package org.challenge.org.challenge

class RemoveDuplicates2 {


    fun removeDuplicates(nums: IntArray): Int {
        var counter = 0
        var lstElement = -1
        var lstValidIndex = -1
        for (i in nums.indices) {
            if (counter < 2) {
                lstElement = nums[i]
                lstValidIndex++
                counter++
            } else if (lstElement != nums[i]) {
                if(counter>2){
                    while (counter - 2 > 0) {
                        nums[++lstValidIndex] = nums[i]
                        counter--
                    }
                }else{
                    nums[++lstValidIndex] = nums[i]
                }
                lstElement = nums[i]
                counter = 1
            }else{
                counter++
            }

        }
        return lstValidIndex
    }
}