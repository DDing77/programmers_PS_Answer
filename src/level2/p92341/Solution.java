package level2.p92341;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 주차 요금 계산
 * Level : 2
 * Language : Java
 * Category : Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/92341
 */

class Solution {

    public TreeMap<String, Integer> payList;
    public HashMap<String, Integer> parkingList;

    private int getMin(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3));

        return hour * 60 + min;
    }

    private int getFee(int totalParkingTime, int[] fees) {
        int fee = fees[1];

        if (totalParkingTime > fees[0]) {
            fee += (((totalParkingTime - fees[0]) + (fees[2] - 1)) / fees[2]) * fees[3];
        }

        return fee;
    }

    public int[] solution(int[] fees, String[] records) {
        payList = new TreeMap<>();
        parkingList = new HashMap<>();

        for (String record : records) {
            String[] info = record.split(" ");
            int time = getMin(info[0]);

            if (parkingList.containsKey(info[1])) {
                payList.put(info[1], payList.getOrDefault(info[1], 0) + (time - parkingList.get(info[1])));
                parkingList.remove(info[1]);
            } else {
                parkingList.put(info[1], time);
            }
        }

        for (Map.Entry<String, Integer> entry : parkingList.entrySet()) {
            int remainTime = (24 * 60 - 1) - entry.getValue();
            payList.put(entry.getKey(), payList.getOrDefault(entry.getKey(), 0) + remainTime);
        }

        int[] answer = new int[payList.size()];
        int idx = 0;
        for (Map.Entry<String, Integer> entry : payList.entrySet()) {
            answer[idx++] = getFee(entry.getValue(), fees);
        }

        return answer;
    }
}
