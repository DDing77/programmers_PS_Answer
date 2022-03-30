import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int N = id_list.length;
            int[] answer = new int[N];
            HashMap<String, HashSet<String>> list = new HashMap<>();
            HashMap<String, Integer> map = new HashMap<>();

            for(int i=0; i<N; i++) {
                String name = id_list[i];
                list.put(name, new HashSet<>());
                map.put(name,i);
            }

            for( String s : report) {
                String[] input = s.split(" ");
                String from = input[0];
                String to = input[1];
                list.get(to).add(from);
            }

            for(int i=0; i<N; i++) {
                HashSet<String> send = list.get(id_list[i]);
                if(send.size()>=k) {
                    for(String name : send) answer[map.get(name)]++;
                }
            }
            return answer;
        }
    }
}
