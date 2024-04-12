package level3.p81303;

import java.util.*;

/**
 * Author : DDing77
 * Problem Name : 표 편집
 * Level : 3
 * Language : Java
 * Category : Stack, Linked-List
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/81303
 */

class Solution {

    public String solution(int n, int k, String[] cmd) {

        Stack<Node> stack = new Stack<>();

        Node initNode = new Node(-1);
        Node preNode = initNode;
        Node curNode = null;

        for (int i = 0; i < n; i++) {
            curNode = new Node(i);
            preNode.next = curNode;
            curNode.pre = preNode;
            preNode = curNode;
        }

        Node endNode = new Node(-1);
        curNode.next = endNode;
        endNode.pre = preNode;

        Node cursor = initNode.next;
        cursor = cursor.down(k);

        for (String str : cmd) {
            StringTokenizer st = new StringTokenizer(str);
            String op = st.nextToken();

            if (op.equals("U")) {
                int value = Integer.parseInt(st.nextToken());
                cursor = cursor.up(value);
            } else if (op.equals("D")) {
                int value = Integer.parseInt(st.nextToken());
                cursor = cursor.down(value);
            } else if (op.equals("C")) {
                cursor = cursor.delete(stack);
            } else if (op.equals("Z")) {
                stack.pop().restore();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("O");
        }

        while (!stack.isEmpty()) {
            Node deletedNode = stack.pop();
            sb.setCharAt(deletedNode.data, 'X');
        }

        return sb.toString();
    }

    static class Node {
        Node pre;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.pre = null;
            this.next = null;
        }

        public Node up(int value) {
            Node cur = this;
            for (int i = 0; i < value; i++) {
                cur = cur.pre;
            }
            return cur;
        }

        public Node down(int value) {
            Node cur = this;
            for (int i = 0; i < value; i++) {
                cur = cur.next;
            }
            return cur;
        }

        public Node delete(Stack<Node> stack) {
            stack.push(this);

            this.pre.next = this.next;
            this.next.pre = this.pre;

            if (this.next.data == -1) {
                return this.pre;
            } else {
                return this.next;
            }
        }

        public void restore() {
            next.pre = this;
            pre.next = this;
        }

    }
}