package geeks;
public class PrintSpiral
{

	public void printSpiral(int[][] ar, int row, int col)
	{
		int r = 0, c = 0;

		while (r < row)
		{
			for (int i = r; i < col; i++)
			{
				System.out.print(ar[r][i]);
				System.out.print(' ');
			}
			r++;

			System.out.printf("Second for loop r,c,row, col: %d, %d, %d, %d\n",r,c,row,col);
			for (int i = r; i < row; i++)
			{
				
				System.out.print(ar[i][col - 1]);
				System.out.print(' ');
			}

			col--;
			if (r < row)
			{
				System.out.printf("Before Third for loop r,c,row, col: %d, %d, %d, %d\n",r,c,row,col);
				for (int i = col - 1; i >= c; i--)
				{
					System.out.print(ar[row - 1][i]);
					System.out.print(' ');
				}
				row--;
			}

			if (c < col)
			{
				System.out.printf("Before Forth for loop r,c,row, col: %d, %d, %d, %d\n",r,c,row,col);
				for (int i = row - 1; i >= r; i--)
				{
					System.out.print(ar[i][c]);
					System.out.print(' ');
				}
				c++;
			}

		}

	}

	// a b c d h l p o n m i e f g k j{ 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g',
	// 'h' }, { 'i', 'j', 'k', 'l' }, { 'm', 'n', 'o', 'p' }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//int[][] al = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		int[][] al = {{1,2},{3,4}};
		new PrintSpiral().printSpiral(al, 2, 2);
	}
}
