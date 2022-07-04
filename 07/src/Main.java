import java.util.*;

class Solution {

    ArrayList<Integer> group;
    Queue<Integer> que;
    public int[] solution(int[] progresses, int[] speeds) {
        group = new ArrayList<>();
        que = new LinkedList<>();


        for(int i=0; i<progresses.length; i++) {
            int diff =  100 - progresses[i];
            int day = diff / speeds[i];
            if( day * speeds[i] < diff) day++;
            que.add(day);
        }

        while(!que.isEmpty()) {
            int left = que.poll();
            int cnt = 1;
            while(!que.isEmpty() && left >= que.peek()){
                cnt++;
                que.poll();
            }
            group.add(cnt);
        }

        int idx = 0;



        int[] answer = new int[group.size()];
        for(int i=0; i<group.size(); i++) answer[i] = group.get(i);
        return answer;
    }
}