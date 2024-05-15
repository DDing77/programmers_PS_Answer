package level0.p181886;

/**
 * Author : DDing77
 * Problem Name : 5명씩
 * Level : 0
 * Language : Java
 * Category : Array
 * Url : https://play.afreecatv.com/khm11903/267641354
 */

class Solution {

    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        int idx = 0;
        for (int i = 0; i < names.length; i += 5) {
            answer[idx++] = names[i];
        }
        return answer;
    }
}