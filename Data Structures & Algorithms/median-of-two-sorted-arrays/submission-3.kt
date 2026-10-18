class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val nums = (nums1 + nums2).sortedArray()

        if (nums.size % 2 != 0) {
            return nums[nums.size / 2] * 1.0
        }

        val i1 = (nums.size / 2) - 1
        val i2 = i1 + 1

        return (nums[i1] + nums[i2]) / 2.0
    }

}
