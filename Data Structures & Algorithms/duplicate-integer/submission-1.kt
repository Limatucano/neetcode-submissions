class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val appears = mutableSetOf<Int>()

        nums.forEach { num ->
            if (appears.contains(num)) {
                return true
            } else {
                appears.add(num)
            }
        }
        return false
    }
}
