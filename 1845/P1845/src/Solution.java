import java.util.ArrayList;

class Solution {

    static ArrayList<Integer> monster;

    public int solution(int[] nums) {
        int answer = 0;

        monster = new ArrayList<>();
        for (int number : nums) {
            if (!monster.contains(number)) {
                monster.add(number);
            }
        }

        if (monster.size() <= nums.length / 2) {
            answer = monster.size();
        } else {
            answer = nums.length / 2;
        }

        return answer;
    }
}