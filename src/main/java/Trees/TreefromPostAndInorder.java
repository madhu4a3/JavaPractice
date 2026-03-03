package Trees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class TreefromPostAndInorder {

    // Function to recursively build the tree from
    // inorder and postorder traversals
    static Node buildUtil(List<Integer> inorder, List<Integer> postorder, int inStrt,
                          int inEnd, int[] pIndex, Map<Integer, Integer> mp) {

        // if start index exceeds end index, return null
        if (inStrt > inEnd)
            return null;

        // Get the current node value from postorder
        // traversal using pIndex and decrement pIndex
        int curr = postorder.get(pIndex[0]);
        Node node = new Node(curr);
        pIndex[0]--;

        // If the current node has no children
        // (inStrt == inEnd), return the node
        if (inStrt == inEnd)
            return node;

        // Find the index of the current node's
        // value in the inorder traversal
        int iIndex = mp.get(curr);

        // Recursively build the right and left subtrees
        node.right = buildUtil(inorder, postorder, iIndex + 1, inEnd, pIndex, mp);
        node.left = buildUtil(inorder, postorder, inStrt, iIndex - 1, pIndex, mp);

        return node;
    }

    // Main function to build the binary tree
    // from inorder and postorder vectors
    static Node buildTree(List<Integer> inorder, List<Integer> postorder) {
        int len = inorder.size();

        // Create an unordered map to store the
        // indexes of inorder elements for quick lookup
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < len; i++)
            mp.put(inorder.get(i), i);

        // Initialize postorder index as the last element
        int[] postIndex = new int []{len-1};

        // Call the recursive utility function to build the tree
        return buildUtil(inorder, postorder, 0, len - 1, postIndex, mp);
    }

    // Function to print preorder traversal of the tree
    static void print(Node curr) {
        if (curr == null)
            return;
        System.out.print(curr.data + " ");
        print(curr.left);
        print(curr.right);
    }

    public static void main(String[] args) {

        List<Integer> inorder = Arrays.asList(4, 8, 2, 5, 1, 6, 3, 7);
        List<Integer> postorder = Arrays.asList(8, 4, 5, 2, 6, 7, 3, 1);

        Node root = buildTree(inorder, postorder);
        print(root);
    }
}
