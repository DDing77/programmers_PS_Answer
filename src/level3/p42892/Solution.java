package level3.p42892;

import java.util.Arrays;

/**
 * Author : DDing77
 * Problem Name : 길 찾기 게임
 * Level : 3
 * Language : Java
 * Category : Tree
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42892
 */

class Solution {

    public int visitOrderNumber;

    private void insertNode(Node parent, Node child) {
        if (parent.x > child.x) {
            if (parent.left == null) {
                parent.left = child;
            } else {
                insertNode(parent.left, child);
            }
        } else {
            if (parent.right == null) {
                parent.right = child;
            } else {
                insertNode(parent.right, child);
            }
        }
    }

    private void preOrder(Node cur, int[][] answer) {
        answer[0][visitOrderNumber++] = cur.number;
        if (cur.left != null) {
            preOrder(cur.left, answer);
        }
        if (cur.right != null) {
            preOrder(cur.right, answer);
        }
    }

    private void postOrder(Node cur, int[][] answer) {
        if (cur.left != null) {
            postOrder(cur.left, answer);
        }
        if (cur.right != null) {
            postOrder(cur.right, answer);
        }
        answer[1][visitOrderNumber++] = cur.number;
    }

    public int[][] solution(int[][] nodeinfo) {
        int size = nodeinfo.length;
        Node[] tree = new Node[size];
        for (int i = 0; i < size; i++) {
            tree[i] = new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]);
        }

        Arrays.sort(tree);

        Node root = tree[0];
        for (int i = 1; i < size; i++) {
            insertNode(root, tree[i]);
        }

        int[][] answer = new int[2][size];
        visitOrderNumber = 0;
        preOrder(root, answer);
        visitOrderNumber = 0;
        postOrder(root, answer);

        return answer;
    }

    static class Node implements Comparable<Node> {
        int number;
        int x;
        int y;
        Node left;
        Node right;

        public Node(int number, int x, int y) {
            this.number = number;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node o) {
            if (this.y == o.y) {
                return Integer.compare(this.x, o.x);
            }
            return Integer.compare(o.y, this.y);
        }
    }
}
