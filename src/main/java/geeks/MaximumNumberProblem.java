package geeks;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MaximumNumberProblem {

	private static int findMaxNumberFromDigits(int num) {
		int[] digits = getDigitsInSortedOrder(num);

		int maxNum = 0;
		for (int index = digits.length - 1; index >= 0; index--) {

			int frequency = digits[index];
			while (frequency > 0) {
				maxNum = maxNum * 10 + index;
				frequency--;
			}
		}
		return maxNum;
	}

	private static int[] getDigitsInSortedOrder(int num) {
		int[] digits = new int[10];

		while (num > 0) {
			// Get remainder
			int index = num % 10;
			digits[index]++;
			num /= 10;
		}
		System.out.println(Arrays.toString(digits));
		return digits;
	}

	public static void main(String[] args) {
		int num = 382993670;
		int maxNum = findMaxNumberFromDigits(num);
		System.out.println("Maximum number : " + maxNum);
	}
}
