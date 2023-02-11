class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length(); i++) {
            if (i + p.length() > t.length()) break;
            String sub = t.substring(i, i + p.length());
            if (sub.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}