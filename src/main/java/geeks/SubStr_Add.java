

package geeks;

public class SubStr_Add {

    /**
     * @param args
     * @return
     */
    void substr_add(int a[], int n, int sum) {
        int curr_sum = a[0], start = 0, i;

        /*
         * Add elements one by one to curr_sum and if the curr_sum exceeds the
         * sum, then remove starting element
         */
        for (i = 1; i < n; i++) {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - a[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) {
                System.out.format("Sum found between indexes %d and %d\n", start, i - 1);
                break;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + a[i];
        }

        // If we reach here, then no subaay
        if (i == n)
            System.out.println("No subaay found");

    }

    public static void main(String[] args) {
        int[] b = { 55, 10, 45, 72 };
        // TODO Auto-generated method stub
        SubStr_Add ssa = new SubStr_Add();
        ssa.substr_add(b, 4, 45);
    }

}
