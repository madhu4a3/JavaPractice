

package Trees;

class Node1 {

    int data;
    Node1 left, right;

    Node1(int item) {
        data = item;
        left = right = null;
    }
}

public class HeightTree {

    Node1 root;

    /*
     * Compute the "maxDepth" of a tree -- the number of nodes along the longest
     * path from the root node down to the farthest leaf node.
     */
    int maxDepth(Node1 node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

    /* Driver program to test mirror() */
    public static void main(String[] args) {

        HeightTree tree = new HeightTree();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        /*
         * tree.root.left.left = new Node1(4); tree.root.left.right = new
         * Node1(5); tree.root.left.right.right = new Node1(6);
         */
        System.out.println("Height of tree is : " + tree.maxDepth(tree.root));

    }
}
