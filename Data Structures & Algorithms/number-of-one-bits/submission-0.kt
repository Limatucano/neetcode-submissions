class Solution {
    fun hammingWeight(n: Int): Int {
        var count = 0
        var value = n
        for (i in 0..31) {
            if ((n shr i) and 1 == 1) count++
        }
        return count
    }
}
