class Solution {

    static int res;
    static boolean[] isVisited;

    public void backTracking(int[] number, int depth, int idx, int sum) {
        if (depth == 3) {
            if (sum == 0) {
                res++;
            }
            return;
        }

        for (int i = idx; i < number.length; i++) {
            backTracking(number, depth + 1, i + 1, sum + number[i]);
        }

    }

    public int solution(int[] number) {
        res = 0;
        isVisited = new boolean[number.length];

        backTracking(number, 0, 0, 0);

        return res;
    }
}