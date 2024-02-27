package level0.p181856

/**
 * Author : DDing77
 * Problem Name: 배열 비교하기
 * Level : 0
 * Language : Kotlin
 * Category : Math, Array
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */

class Solution {

    fun getSum(arr: IntArray): Int {
        var sum = 0
        for (i in arr.indices) {
            sum += arr[i]
        }

        return sum
    }

    fun solution(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size > arr2.size) {
            return 1
        } else if (arr1.size < arr2.size) {
            return -1
        } else {
            var arr1Sum = getSum(arr1)
            var arr2Sum = getSum(arr2)

            if (arr1Sum > arr2Sum) {
                return 1
            } else if (arr1Sum < arr2Sum) {
                return -1
            } else {
                0
            }
        }
        return 0
    }
}