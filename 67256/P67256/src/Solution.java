class Solution {

    static int left = 10;
    static int right = 12;

    public static int getDistance(int index, int target) {
        index = (index == 0) ? 11 : index;
        target = (target == 0) ? 11 : target;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = target / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = number;
            } else {
                int leftLength = getDistance(left, number);
                int rightLength = getDistance(right, number);

                if (leftLength < rightLength) {
                    sb.append("L");
                    left = number;
                } else if (leftLength > rightLength) {
                    sb.append("R");
                    right = number;
                } else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        right = number;
                    } else {
                        sb.append("L");
                        left = number;
                    }
                }
            }
        }

        return sb.toString();
    }

}