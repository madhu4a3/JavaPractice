

package geeks;

public class PrintPreviousSmall {

    public static void main(String... ar) {
        PrintPreviousSmall pps = new PrintPreviousSmall();
        int[] ia = { 1, 3, 0, 2, 5 };
        pps.printPreviousSmall(ia, ia.length);
    }

    public void printPreviousSmall(int[] ia, int n) {

        System.out.print("_, ");
        int i, j;
        for (i = 1; i < n; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (ia[j] < ia[i]) {
                    System.out.print(ia[j] + ", ");
                    break;
                }

            }

            if (j == -1) {
                System.out.print("_, ");
            }
        }
    }
}
