class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size)

        for (i in numbers.indices) {
            answer[i] = numbers[i] * 2;
        }

        return answer
    }
}