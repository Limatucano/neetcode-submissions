class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val appears = mutableMapOf<Int, Int>()

        nums.forEach { num ->
            if (appears[num] != null) {
                return true
            } else {
                appears[num] = 0
            }
        }
        return false
    }
}
