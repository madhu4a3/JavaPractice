package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLRNodes 
{
    Node root;
 
    /* Function to print corner node at each level */
    void printCorner(Node root)
    {
        //  star node is for keeping track of levels
        Queue<Node> q = new LinkedList<Node>();
 
        // pushing root node and star node
        q.offer(root);
        q.offer(null);
 
        // if isFirst = true then left most node of that level
        // will be printed
        boolean isFirst = false;
 
        // if isOne = true then that level has only one node
        boolean isOne = false;
 
        // last will store right most node of that level
        int last = 0;
 
        // Do level order traversal of Binary Tree
        while (!q.isEmpty()) 
        {
            // dequeue the front node from the queue
            Node temp = q.peek();
            q.poll();
 
            // if isFirst is true, then temp is leftmost node
            if (isFirst) 
            {
                System.out.print(temp.data + "  ");
 
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                 
                // make isFirst as false and one = 1
                isFirst = false;
                isOne = true;
            } 
             
            // Else if temp is a separator between two levels
            else if (temp == null) 
            {
                // Insert new separator if there are items in queue
                if (q.size() >= 1) 
                    q.add(null);
                 
                // making isFirst as true because next node will be
                // leftmost node of that level
                isFirst = true;
 
                // printing last node, only if that level
                // doesn't contain single node otherwise
                // that single node will be printed twice              
                if (!isOne)
                    System.out.print(last + "  ");    
            } 
            else
            {
                // Store current key as last
                last = temp.data;
 
                // Here we are making isOne = false to signify
                // that level has more than one node
                isOne = false;
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);               
            }
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
    	PrintLRNodes tree = new PrintLRNodes();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);
 
        tree.printCorner(tree.root);
    }
}