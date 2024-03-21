package level3.p77486;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {

    HashMap<Integer, String> memberIntString;
    HashMap<String, Integer> memberStringInt;
    HashMap<String, Integer> sellerAmount;
    ArrayList<Integer>[] edges;
    int[] answer;

    private int execDFS(int node, String[] enroll) {

        if (edges[node].size() == 0) {
            if (sellerAmount.containsKey(memberIntString.get(node))) {
                int amount = sellerAmount.get(memberIntString.get(node));
                answer[node - 1] = (int) ((amount * 100 )* 0.9);
                return (int) ((amount * 100 )* 0.1);
            }
            return 0;
        }

        int res = sellerAmount.getOrDefault(enroll[node], 0);

        for (int next : edges[node]) {
            res += execDFS(next, enroll);
        }

        answer[node] = (int) (res * 0.9);
        return (int) (res * 0.1);
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        memberIntString = new HashMap<>();
        memberStringInt = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            memberIntString.put(i + 1, enroll[i]);
            memberStringInt.put(enroll[i], i + 1);
        }

        edges = new ArrayList[enroll.length + 1];
        for (int i = 0; i <= enroll.length; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < referral.length; i++) {
            if (referral[i].equals("-")) {
                edges[0].add(i + 1);
                continue;
            }
            edges[memberStringInt.get(referral[i])].add(i + 1);
        }

        sellerAmount = new HashMap<>();
        for (int i = 0; i < seller.length; i++) {
            sellerAmount.put(seller[i], amount[i]);
        }

        for (int i = 0; i < edges.length; i++) {
            System.out.println(edges[i]);
        }

        answer = new int[enroll.length];
        execDFS(0, enroll);
        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(Arrays.toString(test.solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"young", "john", "tod", "emily", "mary"},
                new int[]{12, 4, 2, 5, 10})));
    }
}