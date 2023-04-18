class Solution {
    fun solution(order: Int) = order.toString().length - order.toString().replace("[369]".toRegex(), "").length
}