

package Trees;

public class LeftView {
    Node1 root;
    int max_level = 0;

    // recursive function to print left view
    void leftViewUtil(Node1 Node1, int level) {
        // Base Case
        if (Node1 == null)
            return;

        // If this is the first Node1 of its level
        if (max_level < level) {
            System.out.print(" " + Node1.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(Node1.left, level + 1);
        // iterator right sub tree first to print RightView of tree.
        leftViewUtil(Node1.right, level + 1);
    }

    // A wrapper over leftViewUtil()
    void leftView() {
        leftViewUtil(root, 1);
    }

    /* testing for example nodes */
    public static void main(String args[]) {
        /* creating a binary tree and entering the nodes */
        LeftView tree = new LeftView();
        tree.root = new Node1(12);
        tree.root.left = new Node1(10);
        tree.root.right = new Node1(30);
        tree.root.right.left = new Node1(25);
        tree.root.right.right = new Node1(40);

        tree.leftView();
    }
}
