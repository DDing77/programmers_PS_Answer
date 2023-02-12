import java.util.*;

class Solution {

    static Set<Integer> set;

    public int[] solution(int[] numbers) {
        int[] answer;

        set = new HashSet<>();
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }

        Arrays.sort(answer);

        return answer;
    }
}