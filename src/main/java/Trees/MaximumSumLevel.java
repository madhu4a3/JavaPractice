

package Trees;

import java.util.LinkedList;
import java.util.Queue;


public class MaximumSumLevel {
    public void maxSumLevel(Node1 root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        // level delimiter
        queue.offer(null);

        int maxSum = 0;
        int level = 0;
        // default root level
        int localLevel = 0;
        int localSum = 0;
        while (!queue.isEmpty()) {
            Node1 Node1 = queue.poll();
            // Level change
            if (null == Node1) {
                if (!queue.isEmpty()) {
                    // level delimiter
                    queue.offer(null);
                }

                if (localSum > maxSum) {
                    maxSum = localSum;
                    level = localLevel;
                }
                // Reset the level sum for next level calculation
                localSum = 0;
                localLevel++;
            } else {
                if (Node1.left != null) {
                    queue.offer(Node1.left);
                }
                if (Node1.right != null) {
                    queue.offer(Node1.right);
                }
                localSum += Node1.data;
            }
        }
        System.out.println("Max Sum = " + maxSum + " is at Level = " + level);
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(14);
        root.left.left = new Node1(2);
        root.left.right = new Node1(3);
        root.right.left = new Node1(4);
        root.right.right = new Node1(3);
        MaximumSumLevel msl = new MaximumSumLevel();
        msl.maxSumLevel(root);
    }
}
