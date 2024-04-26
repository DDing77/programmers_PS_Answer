package level2.p155651;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 호텔 대실
 * Level : 2
 * Language : Java
 * Category : Heap
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/155651
 */

class Solution {

    public int solution(String[][] book_time) {

        ArrayList<int[]> bookList = new ArrayList<>();

        for (String[] book : book_time) {
            int start = Integer.parseInt(book[0].replace(":", ""));
            int end = Integer.parseInt(book[1].replace(":", ""));

            end += 10;
            if (end % 100 >= 60) {
                end += 40;
            }

            bookList.add(new int[]{start, end});
        }

        Collections.sort(bookList, Comparator.comparingInt(o -> o[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] book : bookList) {
            if (pq.isEmpty()) {
                pq.add(book[1]);
            } else {
                if (pq.peek() <= book[0]) {
                    pq.poll();
                }
                pq.add(book[1]);
            }
        }
        return pq.size();
    }
}