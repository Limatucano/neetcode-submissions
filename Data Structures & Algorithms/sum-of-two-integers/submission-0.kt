class Solution {
    fun getSum(x: Int, y: Int): Int {
        var a = x
        var b = y
        while (b != 0) {
            val carry = (a and b) shl 1
            a = a xor b
            b = carry
        }

        return a
    }
}
