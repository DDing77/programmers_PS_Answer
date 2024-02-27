package level0.p181950

/**
 * Author : DDing77
 * Problem Name: 문자열 반복해서 출력하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */

fun main(args: Array<String>) {

    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()

    var res = ""
    for (i in 1..a) {
        res += s1
    }

    println(res)
}