package level0.p181949

/**
 * Author : DDing77
 * Problem Name: 대소문자 바꿔서 출력하기
 * Level : 0
 * Language : Kotlin
 * Category : String
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */

fun main(args: Array<String>) {

    val s1 = readLine()!!
    val sb = StringBuilder()

    s1.map {
        if (it in 'a'..'z') {
            sb.append(it.uppercaseChar())
        } else {
            sb.append(it.lowercaseChar())
        }
    }

    println(sb)
}