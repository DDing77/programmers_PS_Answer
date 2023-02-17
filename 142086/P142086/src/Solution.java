import java.util.HashMap;

class Solution {

    static HashMap<Character, Integer> alpha;

    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        alpha = new HashMap<>();
        for(int i=0; i<length; i++) {
            char cur = s.charAt(i);
            if(!alpha.containsKey(cur)) {
                answer[i] = -1;
            } else {
                answer[i] = i -alpha.get(cur);
            }
            alpha.put(cur, i);
        }

        return answer;
    }
}
