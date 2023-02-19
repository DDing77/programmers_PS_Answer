class Solution {
    public int solution(int[] sides) {
        int inputMin = Math.min(sides[0], sides[1]);
        int inputMax = Math.max(sides[0], sides[1]);

        int answer = 0;

        answer += (inputMax + inputMin) - inputMax - 1;
        answer += (inputMax+1) - (inputMax- inputMin + 1);
        return answer;
    }
}