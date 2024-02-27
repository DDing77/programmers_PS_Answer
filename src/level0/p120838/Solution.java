package level0.p120838;

import java.util.HashMap;

/**
 * Author : DDing77
 * Problem Name: 모스부호 (1)
 * Level : 0
 * Language : Java
 * Category : Implementation
 * References : https://school.programmers.co.kr/learn/courses/30/lessons/120838
 */

class Solution {

    static HashMap<String, Character> mos;

    public String solution(String letter) {

        StringBuilder answer = new StringBuilder();

        mos = new HashMap<>();
        mos.put(".-", 'a');
        mos.put("-...", 'b');
        mos.put("-.-.", 'c');
        mos.put("-..", 'd');
        mos.put(".", 'e');
        mos.put("..-.", 'f');
        mos.put("--.", 'g');
        mos.put("....", 'h');
        mos.put("..", 'i');
        mos.put(".---", 'j');
        mos.put("-.-", 'k');
        mos.put(".-..", 'l');
        mos.put("--", 'm');
        mos.put("-.", 'n');
        mos.put("---", 'o');
        mos.put(".--.", 'p');
        mos.put("--.-", 'q');
        mos.put(".-.", 'r');
        mos.put("...", 's');
        mos.put("-", 't');
        mos.put("..-", 'u');
        mos.put("...-", 'v');
        mos.put(".--", 'w');
        mos.put("-..-", 'x');
        mos.put("-.--", 'y');
        mos.put("--..", 'z');

        String[] input = letter.split(" ");

        for (int i = 0; i < input.length; i++) {
            answer.append(mos.get(input[i]));
        }

        return answer.toString();
    }
}
