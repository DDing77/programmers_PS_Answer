package level3.p72414;

/**
 * Author : DDing77
 * Problem Name : 광고 삽입
 * Level : 3
 * Language : Java
 * Category : Prefix-Sum
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/72414
 */

class Solution {

    public long[] prefixSum;

    public int[] convertLogToSecond(String log) {
        String[] logSplit = log.split("-");
        return new int[]{convertTimeStringToSecond(logSplit[0]), convertTimeStringToSecond(logSplit[1])};
    }

    public int convertTimeStringToSecond(String time) {
        String[] dateTime = time.split(":");
        return Integer.parseInt(dateTime[0]) * 3600 + Integer.parseInt(dateTime[1]) * 60 + Integer.parseInt(dateTime[2]);
    }

    public String solution(String play_time, String adv_time, String[] logs) {
        prefixSum = new long[360001];

        for (String log : logs) {
            int[] secondInfo = convertLogToSecond(log);
            prefixSum[secondInfo[0]]++;
            prefixSum[secondInfo[1]]--;
        }

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }

        int playTime = convertTimeStringToSecond(play_time);
        int advTimeSecond = convertTimeStringToSecond(adv_time);
        long max = prefixSum[advTimeSecond - 1];
        int minStartTime = 0;

        for (int i = advTimeSecond; i <= playTime; i++) {
            long rangeSum = prefixSum[i] - prefixSum[i - advTimeSecond];
            if (rangeSum > max) {
                max = rangeSum;
                minStartTime = i - advTimeSecond + 1;
            }
        }

        int resHour = minStartTime / 3600;
        int resMin = (minStartTime % 3600) / 60;
        int resSec = minStartTime % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", resHour)).append(":").append(String.format("%02d", resMin)).append(":").append(String.format("%02d", resSec));
        return sb.toString();
    }
}