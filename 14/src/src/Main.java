import java.util.*;

class Solution {

    static HashMap<String, Integer> list;

    public int solution(String[][] clothes) {

        list = new HashMap<>();
        int length = clothes.length;

        for(int i=0; i<length; i++) {
            System.out.println(clothes[i][1]);
            list.put(clothes[i][1], list.getOrDefault(clothes[i][1], 0) +1);
        }
        int sum = 1;
        for(int val : list.values()) {
            System.out.println(val);
            sum *= val+1;
        }
        int answer = sum - 1;
        return answer;
    }
}