class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var temp = ArrayDeque<Int>()

        numbers.map {
            temp.add(it)
        }

        if (direction.equals("left")) {
            temp.addLast(temp.removeFirst())
        } else {
            temp.addFirst(temp.removeLast())
        }

        return temp.toIntArray()
    }
}