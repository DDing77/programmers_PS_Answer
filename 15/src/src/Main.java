import java.util.*;

class Solution {

    public Stack<Character> stack;

    public String solution(String number, int k) {
        stack = new Stack<>();

        for(int i=0; i<number.length(); i++) {
            char cur = number.charAt(i);
            while(!stack.isEmpty() && stack.peek() < cur && k>0) {
                stack.pop();
                k--;
            }
            stack.push(cur);
        }
        String res = "";
        for(int i=0; i<stack.size()-k; i++) {
            res = res + String.valueOf(stack.get(i));
        }
        return res;
    }
}