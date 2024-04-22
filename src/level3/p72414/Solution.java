package level3.p72414;

import java.util.Arrays;

class Solution {

    public int[] prefixSum;

    public int[] convertLogToSecond(String log) {

        String start = log.substring(0, 8);
        String end = log.substring(9);
        return new int[]{convertTimeStringToSecond(start), convertTimeStringToSecond(end)};
    }

    public int convertTimeStringToSecond(String time) {

        String[] dateTime = time.split(":");
        return Integer.parseInt(dateTime[0]) * 3600 + Integer.parseInt(dateTime[1]) * 60 + Integer.parseInt(dateTime[2]);
    }

    public String solution(String play_time, String adv_time, String[] logs) {

        prefixSum = new int[360000 + 1];

        for (String log : logs) {
            int[] secondInfo = convertLogToSecond(log);
//            System.out.println("secondInfo[0] = " + secondInfo[0]);
//            System.out.println("secondInfo[1] = " + secondInfo[1]);
            prefixSum[secondInfo[0]]++;
            prefixSum[secondInfo[1] + 1]--;
        }
//        0 0 0 0 0;
//        0 1 0 -1 0;
//        0 0 1 0 -1;
//        0 1 2 1 0
//        int max = 0;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
//            System.out.println("Math.max(max, prefixSum[i]) = " + Math.max(max, prefixSum[i]));
        }

        Arrays.sort(logs);
        System.out.println(Arrays.toString(logs));
        String answer = "";

        int advTimeSecond = convertTimeStringToSecond(adv_time);
        int startTime = convertLogToSecond(logs[0])[0];
        int max = 0;
        int minStartTime = Integer.MAX_VALUE;
//        for (int i = 1; i <= convertLogToSecond(logs[logs.length - 1])[1] - advTimeSecond + 1; i++) {
        for (int i = 1; i < prefixSum.length - advTimeSecond + 1; i++) {
            int rangeSum = prefixSum[i + advTimeSecond - 1] - prefixSum[i - 1];
            if (rangeSum > max) {
                max = rangeSum;
                minStartTime = i;
            }
        }
//        System.out.println("minStartTime = " + minStartTime);
//        System.out.println("hour = " + minStartTime / 3600);
//        System.out.println("minStartTime = " + minStartTime / 60);
//        System.out.println("second = " + minStartTime % 60);
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("50:00:00", "50:00:00", new String[]{"15:36:51-38:21:49", "10:14:18-15:36:51", "38:21:49-42:51:45"}));
    }
}