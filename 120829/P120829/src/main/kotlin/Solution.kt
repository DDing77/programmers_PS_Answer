class Solution {
    fun solution(angle: Int): Int {
        return if (angle == 0 || angle == 180) {
            4;
        } else if (angle in 91..179) {
            3;
        } else if (angle == 90) {
            2;
        } else {
            1;
        }
    }
}