package geeks;
public class KthSmallest
{

	public static void main(String[] args)
	{
		int arr[] = { 12, 3,11,12, 5, 7, 4, 19, 26 };
		
		int k = 5;
		System.out.println("K'th smallest element is " + findkthSmallestElement(arr, k));
	}

	public static int kthSmallest(int[] arrA, int start, int end, int k)
	{
		int left = start;
		int right = end;
		int pivot = start;
		while (left <= right) {
			while (left <= right && arrA[left] <= arrA[pivot])
				left++;
			while (left <= right && arrA[right] >= arrA[pivot])
				right--;
			if (left < right) {
				swap(arrA, left, right);
				left++;
				right--;
			}
		}
		swap(arrA, pivot, right);
		System.out.printf("pivot here is %d\n", pivot);
		if (pivot == k)
			return arrA[pivot];// if pivot is kth element , return
		else if (pivot < k){
			// if pivot is less than k, then kth element will be on the right
			System.out.printf("incrementing pivot ");
						return kthSmallest(arrA, pivot + 1, end, k);
		}			
		else{
			System.out.printf("decrementing pivot");
			// if pivot is greater than k, then kth element will be on the right
						return kthSmallest(arrA, start, pivot - 1, k);
		}
			
	}

	public static int findkthSmallestElement(int[] arrA, int k) {
		k = k - 1; // since array index starts with 0
		return kthSmallest(arrA, 0, arrA.length - 1, k);
	}

	public static void swap(int arr[], int x, int y)
	{

		int temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
	}

	
}
