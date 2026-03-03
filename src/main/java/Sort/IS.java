

package Sort;

import java.util.Scanner;


/* Class InsertionSort */
public class IS
{
	/* Insertion Sort function */
	public static void sort(int arr[])
	{
		int N = arr.length;
		int i, j, temp;
		for (i = 1; i < N; i++)
		{
			j = i-1;
			temp = arr[i];
			while (j >= 0 && temp < arr[j])
			{
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = temp;
		}
	}

	/* Main method */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Insertion Sort TurnOffBitN\n");
		int n, i;
		/* Accept number of elements */
		System.out.println("Enter number of integer elements");
		n = scan.nextInt();
		/* Create integer array on n elements */
		int arr[] = new int[n];
		/* Accept elements */
		System.out.println("\nEnter " + n + " integer elements");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		/* Call method sort */
		sort(arr);
		/* Print sorted Array */
		System.out.println("\nElements after sorting ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
