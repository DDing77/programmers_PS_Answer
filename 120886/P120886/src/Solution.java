class Solution {

    static int[] alphaA, alphaB;

    public static void getAlpha(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
    }

    public int solution(String before, String after) {
        StringBuilder sb = new StringBuilder(before);

        alphaA = new int[26];
        alphaB = new int[26];

        getAlpha(before, alphaA);
        getAlpha(after, alphaB);


        for (int i = 0; i < 26; i++) {
            if (alphaA[i] != alphaB[i]) {
                return 0;
            }
        }

        return 1;
    }
}