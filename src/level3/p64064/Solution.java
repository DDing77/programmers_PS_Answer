package level3.p64064;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Author : DDing77
 * Problem Name: 불량 사용자
 * Level : 3
 * Language : Java
 * Category : DFS, Bitmask
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/64064
 */

class Solution {

    Set<Integer> res;

    private boolean check(String user, String banned) {

        String regex = banned.replaceAll("\\*", "[^*]");
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(user).matches();
    }

    private void findBannedUser(int bitmask, String[] user_id, String[] banned_id, int depth) {

        if (depth == banned_id.length) {
            res.add(bitmask);
            return;
        }

        for (int i = 0; i < user_id.length; i++) {
            if (((bitmask >> i) & 1) == 0 && check(user_id[i], banned_id[depth])) {
                findBannedUser((bitmask | 1 << i), user_id, banned_id, depth + 1);
            }
        }
    }

    public int solution(String[] user_id, String[] banned_id) {

        res = new HashSet<>();

        findBannedUser(0, user_id, banned_id, 0);

        return res.size();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"*rodo", "*rodo", "******"}));
    }
}