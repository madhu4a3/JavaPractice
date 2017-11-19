package geeks;
import java.util.Arrays;

public class RearrangeArrayPositiveNegative
{
	int[] arrA;

	public RearrangeArrayPositiveNegative(int[] arrA)
	{
		this.arrA = arrA;
	}

	public void divideGroups(int low, int high)
	{
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		divideGroups(low, mid);
		divideGroups(mid + 1, high);
		merge(low, mid, high);

	}

	public void merge(int low, int mid, int high)
	{
		int l = low;
		int k = mid + 1;
		while (l <= mid && arrA[l] <= 0)
			l++;
		while (k <= high && arrA[k] <= 0)
			k++;
		System.out.println("Before 1st reverse: " +Arrays.toString(arrA));
		reverse(l, mid);
		reverse(mid + 1, k - 1);
		reverse(l, k - 1);
	}

	public void reverse(int x, int y)
	{
		while (y > x)
		{
			int temp = arrA[x];
			arrA[x] = arrA[y];
			arrA[y] = temp;
			x++;
			y--;
		}
		System.out.println("reverse: " +Arrays.toString(arrA));
	}

	public void display()
	{
		for (int i = 0; i < arrA.length; i++)
		{
			System.out.print(" " + arrA[i]);
		}
	}
	
	public void swap(int[] arr, int i, int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public void rearrage(int[] arrA, int l, int h){
		while(l<h){
			while(arrA[l] < 0 && l<h)
				l++;
			while(arrA[h] >=0 && l<h)
				h--;
			if(l<h){
				swap(arrA, l, h);
				l++;
				h--;
			}
		}
	}

	public static void main(String args[])
	{
		int[] a = { 1, -2, -3, -4, 5, -6, 7, -8, 9, -10, -11, -12, 20 };
		RearrangeArrayPositiveNegative r = new RearrangeArrayPositiveNegative(a);
		System.out.print("Input : ");
		r.display();
		r.divideGroups(0, a.length - 1);
		//r.rearrage(a,  0, a.length-1);
		System.out.println("");
		System.out.print("ReArranged Output : ");
		r.display();
		
	}
}
