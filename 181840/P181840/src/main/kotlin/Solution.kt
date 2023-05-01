    class Solution {
        fun solution(num_list: IntArray, n: Int): Int {
            if (num_list.contains(n)) {
                return 1
            }
            return 0
        }
    }