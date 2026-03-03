package geeks;

public class ReverseArrayInOrderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArrayInOrderN ra = new ReverseArrayInOrderN();
		int r[] = ra.reverseArray(new int[]{1, 4,5,6,7,9,10,11,23},3);;
		for(int e :  r){
			System.out.print(e+ " ");
		}
		
	}

	private int[] reverseArray(int[] A, int k) {
        for (int i = 0; i < A.length; i += k) {
            int left = i;
            // in case right larger than A.length
            int right = Math.min(i + k - 1, A.length - 1);

            // reverse sub array
            while (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }
        }

        return A;
    }
}
