package level0.p181875;

/**
 * Author : DDing77
 * Problem Name : 배열에서 문자열 대소문자 변환하기
 * Level : 0
 * Language : Java
 * Category : String
 * Url : https://play.afreecatv.com/devil0108/265415546
 */

class Solution {

    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}