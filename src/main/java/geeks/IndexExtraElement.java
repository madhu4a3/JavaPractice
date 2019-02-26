package geeks;
public class IndexExtraElement {
    // Returns index of extra element in arr1[].
    // n is size of arr2[]. Size of arr1[] is
    // n-1.
    static int findExtra(int arr1[], int arr2[], int la, int lb) {
        int index = 0; // Initialize result

        // left and right are end points denoting
        // the current range.

        if (arr1[la - 1] != arr2[lb - 1]) {
            return la > lb ? la - 1 : lb - 1;
        }
        int left = 0, right = Math.min(la, lb) - 1;
        while (left <= right) {

            int mid = (left + right) / 2;

            // If middle element is same of both
            // arrays, it means that extra element
            // is after mid so we update left to mid+1
            if (arr2[mid] == arr1[mid])
                left = mid + 1;

            // If middle element is different of the
            // arrays, it means that the index we are
            // searching for is either mid, or before
            // mid. Hence we update right to mid-1.
            else {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than left our
        // search is complete.
        return index;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 5, 8, 10, 12 };
        int arr2[] = { 2, 4, 6, 8, 10, 12 };
        int n = arr2.length;

        // Solve is passed both arrays
        System.out.println(findExtra(arr1, arr2, arr1.length, arr2.length));
    }
}
