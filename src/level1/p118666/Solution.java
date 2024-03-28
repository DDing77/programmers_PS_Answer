package level1.p118666;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 성격 유형 검사하기
 * Level : 1
 * Language : Java
 * Category : Implementation
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */

class Solution {

    Map<Character, Integer> typeStatus = new HashMap<>();
    ArrayList<TypePair> typePairs;

    public String solution(String[] survey, int[] choices) {

        typePairs = new ArrayList<>();
        typePairs.add(new TypePair('R', 'T'));
        typePairs.add(new TypePair('C', 'F'));
        typePairs.add(new TypePair('J', 'M'));
        typePairs.add(new TypePair('A', 'N'));

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];

            char type;
            if (choice <= 3) {
                type = survey[i].charAt(0);
                typeStatus.put(type, typeStatus.getOrDefault(type, 0) + (4 - choice));
            } else if (choice > 3) {
                type = survey[i].charAt(1);
                typeStatus.put(type, typeStatus.getOrDefault(type, 0) + (choice - 4));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (TypePair cur : typePairs) {
            if (typeStatus.getOrDefault(cur.aType, 0) >= typeStatus.getOrDefault(cur.bType, 0)) {
                answer.append(cur.aType);
            } else {
                answer.append(cur.bType);
            }
        }

        return answer.toString();
    }

    static class TypePair {

        char aType;
        char bType;

        public TypePair(char aType, char bType) {
            this.aType = aType;
            this.bType = bType;
        }
    }
}