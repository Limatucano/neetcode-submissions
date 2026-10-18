class Solution {
    fun twoSum(
        nums: IntArray,
        target: Int
    ): IntArray {
        // key: num, value: Index
        val result = IntArray(2)
        val n = nums.withIndex().associateBy ({it.value}, {it.index})
        nums.forEachIndexed{ index, num ->
            val expectedSum = target + (num * -1)
            if (n.containsKey(expectedSum) && n[expectedSum] != index) {
                return intArrayOf(index, n[expectedSum] ?: 0)
            }
        }

        return result
    }
}
