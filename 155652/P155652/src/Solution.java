class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int cnt = 0;

            while (cnt < index) {
                ch += 1;

                if (ch > 'z') {
                    ch = 'a';
                }

                if (!skip.contains(Character.toString(ch))) {
                    cnt++;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}