package Trees;


public class SubTreeCheck {

    // Utility function to check if two trees are identical
    static boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        // Check if data and left/right subtrees are identical
        return (root1.data == root2.data &&
                areIdentical(root1.left, root2.left) &&
                areIdentical(root1.right, root2.right));
    }

    // Function to check if root2 is a subtree of root1
    static boolean isSubtree(Node root1, Node root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;

        // Check if the current node of root1 matches
        // the root of root2
        if (areIdentical(root1, root2))
            return true;

        // Recur for left and right subtrees of root1
        return isSubtree(root1.left, root2)
                || isSubtree(root1.right, root2);
    }

    public static void main(String[] args) {

        // Construct Tree root1
        //          26
        //         /  \
        //        10   3
        //       / \    \
        //      4   6    3
        //       \
        //        30
        Node root1 = new Node(26);
        root1.right = new Node(3);
        root1.right.right = new Node(3);
        root1.left = new Node(10);
        root1.left.left = new Node(4);
        root1.left.left.right = new Node(30);
        root1.left.right = new Node(6);

        // Construct Tree root2
        //          10
        //         /  \
        //        4    6
        //         \
        //          30
        Node root2 = new Node(10);
        root2.right = new Node(6);
        root2.left = new Node(4);
        root2.left.right = new Node(30);

        if (isSubtree(root1, root2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}