

package Trees;

import java.util.ArrayList;
import java.util.List;


public class LargestValuesOfLevel {

    Node1 root;

    public List<Integer> largestValues(Node1 root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    private void helper(Node1 root, List<Integer> res, int d) {
        if (root == null) {
            return;
        }
        // expand list size
        if (d == res.size()) {
            res.add(root.data);
        } else {
            // or set value
            res.set(d, Math.max(res.get(d), root.data));
        }
        helper(root.left, res, d + 1);
        helper(root.right, res, d + 1);
    }

    public static void main(String args[]) {

        LargestValuesOfLevel lvl = new LargestValuesOfLevel();
        lvl.root = new Node1(2);
        lvl.root.left = new Node1(9);
        lvl.root.right = new Node1(4);
        lvl.root.left.left = new Node1(5);
        lvl.root.left.right = new Node1(6);
        lvl.root.right.left = new Node1(7);
        lvl.root.right.right = new Node1(8);
        List<Integer> lI = lvl.largestValues(lvl.root);
        System.out.println(lI);

    }
}
