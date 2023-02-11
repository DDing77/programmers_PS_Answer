class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        for (int i = 1; i <= 10; i++) {
            temp *= i;
            if (temp > n) break;
            answer = i;
        }
        return answer;
    }
}