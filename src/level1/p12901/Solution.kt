package level1.p12901

/**
 * Author : DDing77
 * Problem Name: 2016년
 * Level : 1
 * Language : Kotlin
 * Category : Math, Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */

class Solution {

    fun solution(a: Int, b: Int): String {
        var dayStr = arrayListOf<String>();
        val months = intArrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        dayStr.add("FRI")
        dayStr.add("SAT")
        dayStr.add("SUN")
        dayStr.add("MON")
        dayStr.add("TUE")
        dayStr.add("WED")
        dayStr.add("THU")

        var answer = ""
        var sum = -1;

        for (i in 1 until a) {
            sum += months[i]
        }

        sum += b
        println(sum)
        answer = dayStr[(sum % 7)]

        return answer
    }
}