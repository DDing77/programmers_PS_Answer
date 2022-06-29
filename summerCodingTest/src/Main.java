import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//public class Main {
//    // 2번 문제
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        int firstIndex = input.indexOf('[');
//        int secondIndex = input.indexOf(']');
//
//        String sub = input.substring(firstIndex+1, secondIndex);
//
//        System.out.println(sub);
//
//    }
//
//    static public class Info {
//        ArrayList<Integer> roomNum;
//        String name;
//
//        int distance;
//
//    }
//
//    public String[] solution(String[] rooms, int target) {
//
//
//        String[] answer = {};
//
//        int length = answer.length;
//
//
//
//        return answer;
//    }
//
//}
//    // 3번 문제
//import java.util.HashMap;
//
//    class Solution {
//
//        static public int getDistance(int leftRow, int leftCol, int rightRow, int rightCol, int targetRow,
//                                      int targetCol) {
//
//            int leftDistance = Math.abs(leftCol - targetCol) + Math.abs(leftRow - targetRow);
//            int rightDistance = Math.abs(rightCol - targetCol) + Math.abs(rightRow - targetRow);
//
//            // 왼쪽이 가까우면 -1 리턴
//            if (leftDistance < rightDistance) return -1;
//                // 같으면 0
//            else if (leftDistance == rightDistance) return 0;
//                // 오른쪽이 가까우면 1
//            else return 1;
//        }
//
//        static HashMap<Integer, int[]> number = new HashMap<>();
//
//        static public int[] solution(String line) {
//            number.put(1, new int[]{1, 1});
//            number.put(2, new int[]{1, 2});
//            number.put(3, new int[]{1, 3});
//            number.put(4, new int[]{1, 4});
//            number.put(5, new int[]{1, 5});
//            number.put(6, new int[]{1, 6});
//            number.put(7, new int[]{1, 7});
//            number.put(8, new int[]{1, 8});
//            number.put(9, new int[]{1, 9});
//            number.put(0, new int[]{1, 10});
//
//            number.put('Q' - '0', new int[]{2, 1});
//            number.put('W' - '0', new int[]{2, 2});
//            number.put('E' - '0', new int[]{2, 3});
//            number.put('R' - '0', new int[]{2, 4});
//            number.put('T' - '0', new int[]{2, 5});
//            number.put('Y' - '0', new int[]{2, 6});
//            number.put('U' - '0', new int[]{2, 7});
//            number.put('I' - '0', new int[]{2, 8});
//            number.put('O' - '0', new int[]{2, 9});
//            number.put('P' - '0', new int[]{2, 10});
//
//
//            // 처음 왼쪽 좌표
//            int leftRow = 2;
//            int leftCol = 1;
//
//            // 처음 오른쪽 좌표
//            int rightRow = 2;
//            int rightCol = 10;
//
//            int length = line.length();
//            int[] res = new int[length];
//
//            for (int i = 0; i < length; i++) {
//                char nowC = line.charAt(i);
//
//                int targetRow = number.get(nowC -'0')[0];
//                int targetCol = number.get(nowC -'0')[1];
//
//                int flag = getDistance(leftRow, leftCol, rightRow, rightCol, targetRow, targetCol);
//
//                if (flag == -1) { // 맨해튼 거리가 왼쪽이 적음
//                    res[i] = 0;
//                    leftRow = targetRow;
//                    leftCol = targetCol;
//                } else if (flag == 0) { // 맨해튼 거리 같음
//                    int leftDistance = Math.abs(leftCol - targetCol);
//                    int rightDistance = Math.abs(rightCol - targetCol);
//
//                    if (leftDistance < rightDistance) {
//                        res[i] = 0;
//                        leftRow = targetRow;
//                        leftCol = targetCol;
//                    } else if (leftDistance == rightDistance) {
//                        if (targetCol <= 5) {
//                            res[i] = 0;
//                            leftRow = targetRow;
//                            leftCol = targetCol;
//                        } else {
//                            res[i] = 1;
//                            rightRow = targetRow;
//                            rightCol = targetCol;
//                        }
//                    } else {
//                        res[i] = 1;
//                        rightRow = targetRow;
//                        rightCol = targetCol;
//                    }
//                } else { // 오른쪽 맨해튼 거리가 작음
//                    res[i] = 1;
//                    rightRow = targetRow;
//                    rightCol = targetCol;
//                }
//
//            }
//            return res;
//        }
//    }


//    // 1번문제
//    public int solution(int[][] atmos) {
//
//        int length = atmos.length;
//        int day = 0;
//        int cnt = 0;
//        boolean wear = false;
//
//        for(int i = 0; i<length; i++) {
//
//            if(!wear) { // 마스크 안끼고 있었을 때
//                // 둘다 매우나쁨
//                if(atmos[i][0] >= 151 && atmos[i][1]  >= 76) {
//                    cnt++;
//                    continue;
//                } else if( atmos[i][0] >= 81 || atmos[i][1]  >= 36) { // 둘 중에 하나 이상 나쁨
//                    wear = true;
//                    cnt++;
//                    day++;
//                }
//            } else { // 마스크 끼고 있었을 때
//                // 둘다 매우 나쁨
//                if(atmos[i][0] >= 151 && atmos[i][1]   >= 76) {
//                    wear = false;
//                    day = 0;
//                    continue;
//                } else if( atmos[i][0] >= 81 || atmos[i][1]  >= 36) { // 둘 중에 하나 이상 나쁨
//                    wear = true;
//                    day++;
//                } else {
//                    day++;
//                }
//            }
//
//            if(day == 3) { // 2틀 후 강제 폐기
//                day = 0;
//                wear = false;
//            }
//        }
//
//        return cnt;
//}
//}
