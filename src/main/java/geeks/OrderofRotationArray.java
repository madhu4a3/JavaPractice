package geeks;
public class OrderofRotationArray
{

	static int findMin(int[] a, int low, int high)
	{

		if (high < low)
			return 0;
		if (high == low)
			return low;
		int mid = low + (high - low) / 2;
		// System.out.println("mid is:"+mid);
		if (mid < high && a[mid + 1] < a[mid])
			return mid + 1;
		if (mid > low && a[mid] < a[mid - 1])
			return mid;
		if (a[high] > a[mid])
			return findMin(a, low, mid - 1);

		return findMin(a, mid + 1, high);
	}

	public static void main(String[] str)
	{
		int[] b = { 5, 6, 7, 1, 2, 3, 4 };
		// int[] b = { 1, 2, 3, 4, 5 };
		int orderOfRotation = findMin(b, 0, b.length - 1);
		System.out.println("Order of rotation:" + orderOfRotation);
	}

}
