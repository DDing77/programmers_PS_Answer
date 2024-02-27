package level0.p120823

/**
 * Author : DDing77
 * Problem Name: 직각삼각형 출력하기
 * Level : 0
 * Language : Kotlin
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */

fun main(args: Array<String>) {

    val (n) = readLine()!!.split(' ').map(String::toInt)
    var sb = StringBuilder()

    for (i in 1..n) {
        for (j in 1..i) {
            sb.append('*')
        }
        sb.append('\n')
    }

    println(sb)
}