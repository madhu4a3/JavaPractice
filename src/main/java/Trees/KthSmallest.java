package Trees;

public class KthSmallest {
    public static void main(String[] args) {
        Node node= new Node(12);
        node.left = new Node(10);
        node.right = new Node(30);
        node.right.left = new Node(25);
        node.right.right = new Node(40);
        System.out.println(kthSmallest(node, 2));
    }
    static int kthSmallestRecur(Node root, int cnt, int k) {
        if (root == null) return -1;

        int left = kthSmallestRecur(root.left, cnt, k);

        // If kth smallest is found in left
        // subtree, then return it
        if (left != -1) return left;

        cnt++;

        // If curr node is kth smallest,
        // return it
        if (cnt == k) return root.data;

        // Else process the right subtree
        // and return its value
        int right = kthSmallestRecur(root.right, cnt, k);
        return right;
    }

    // Function to find kth Smallest
    static int kthSmallest(Node root, int k) {
        int cnt =0;
        return kthSmallestRecur(root, cnt, k);
    }
}
