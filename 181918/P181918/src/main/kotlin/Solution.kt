import java.util.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()

        var idx = 0;
        while (idx < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[idx]
                idx++
            } else if (stk.last() < arr[idx]) {
                stk += arr[idx]
                idx++
            } else {
                stk = stk.dropLast(1).toIntArray()
            }
        }

        return stk
    }
}