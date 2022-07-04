class Solution {

    int DIV = 1234567;
    int[] fib;

    public int solution(int n) {
        fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) fib[i] = (fib[i - 2] + fib[i - 1]) % DIV;

        int answer = fib[n];
        return answer;
    }
}