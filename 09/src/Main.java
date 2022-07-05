class Solution {
    public int res = 0;
    public int[] arr;
    public String[] operation = {"+", "-"};

    public void dfs(String str, int target) {
        if (str.length() == arr.length) {
            int number = solve(str, arr, target);
            if (number == target) res++;
            return;
        }

        for (int i = 0; i < 2; i++) {
            dfs(str + operation[i], target);
        }
    }

    public int solve(String str, int[] numbers, int target) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') sum += numbers[i];
            else sum -= numbers[i];
        }

        return sum;
    }

    public int solution(int[] numbers, int target) {
        arr = numbers;
        dfs("", target);
        return res;
    }
}