package geeks;

import java.util.ArrayList;
import java.util.Arrays;

class CombinationSum {

    // Function to generate all combinations
    // of arr that sums to target.
    static void makeCombination(int[] arr, int remSum, ArrayList<Integer> cur,
                                ArrayList<ArrayList<Integer>> res, int index) {

        if (remSum == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        // Invalid Case: If remSum is less than 0 or if index >= arr.length
        if (remSum < 0 || index >= arr.length)
            return;

        // Add the current element to the combination
        cur.add(arr[index]);

        // Recur with the same index
        makeCombination(arr, remSum - arr[index], cur, res, index);

        // Remove the current element from the combination
        cur.remove(cur.size() - 1);
        makeCombination(arr, remSum, cur, res, index + 1);
    }

    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {

        // List to store combinations
        ArrayList<Integer> cur = new ArrayList<>();

        // List to store valid combinations
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        makeCombination(arr, target, cur, res, 0);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 5;

        ArrayList<ArrayList<Integer>> res = targetSumComb(arr, target);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}