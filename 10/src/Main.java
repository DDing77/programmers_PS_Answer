import java.util.*;

class Solution {

    public static PriorityQueue<Integer> pq;
    public static ArrayList<Integer> list;
    public static int res;

    public void inputToQueue(int[] scoville) {
        pq = new PriorityQueue<>();
        for(int element : scoville) pq.add(element);
    }

    public void solution(int K) {
        res = 0;
        while(!pq.isEmpty()) {
            int first = pq.poll();
            if(first >= K) break;
            int second = pq.poll();

            int newScoville = first + second * 2;
            if(pq.size() == 0 && newScoville < K) {
                res= -1;
                break;
            }
            pq.add(newScoville);
            res++;
        }
    }

    public int solution(int[] scoville, int K) {
        list = new ArrayList<>();

        inputToQueue(scoville);

        solution(K);

        return res;
    }
}