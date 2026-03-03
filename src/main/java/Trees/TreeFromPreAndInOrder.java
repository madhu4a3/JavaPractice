

package Trees;

class Node2 {
    char data;
    Node2 left, right;

    Node2(char item) {
        data = item;
        left = right = null;
    }
}

public class TreeFromPreAndInOrder {
    Node2 root;
    int preIndex = 0;

    /*
     * Recursive function to construct binary of size len from Inorder traversal
     * in[] and Preorder traversal pre[]. Initial values of inStrt and inEnd
     * should be 0 and len -1. The function doesn't do any error checking for
     * cases where inorder and preorder do not form a tree
     */
    Node2 buildTree(char in[], char pre[], int inStrt, int inEnd) {
        if (inStrt > inEnd)
            return null;

        /*
         * Pick current Node2 from Preorder traversal using preIndex and
         * increment preIndex
         */
        Node2 tNode = new Node2(pre[preIndex++]);

        /* If this Node2 has no children then return */
        if (inStrt == inEnd)
            return tNode;

        /* Else find the index of this Node2 in Inorder traversal */
        int inIndex = this.search(in, inStrt, inEnd, tNode.data);

        /*
         * Using index in Inorder traversal, construct left and right subtress
         */
        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);

        return tNode;
    }

    /* UTILITY FUNCTIONS */

    /*
     * Function to find index of value in arr[start...end] The function assumes
     * that value is present in in[]
     */
    int search(char arr[], int strt, int end, char value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                break;
        }
        return i;
    }

    /* This funtcion is here just to test buildTree() */
    void printInorder(Node2 Node2) {
        if (Node2 == null)
            return;

        /* first recur on left child */
        printInorder(Node2.left);

        /* then print the data of Node2 */
        System.out.print(Node2.data + " ");

        /* now recur on right child */
        printInorder(Node2.right);
    }

    // driver program to test above functions
    public static void main(String args[]) {
        TreeFromPreAndInOrder tree = new TreeFromPreAndInOrder();
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Node2 root = tree.buildTree(in, pre, 0, len - 1);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
