package geeks;

public class ArraysMissingElement {
	
	int[] a = {1,2,3,45,78, 90};
	int[] b = {1,2,3,45,78};
	public static void main (String[] args){
		ArraysMissingElement ame = new ArraysMissingElement();
		ame.findMissingEle(ame.a, ame.b);
	}
	
	void findMissingEle(int[] x, int[] y){
		if(x.length != y.length+1){
			throw new IllegalArgumentException("Array A should be larger than Array B");
			
		}
		
		
		int res = x[0];
		for(int i = 1; i < x.length; i++){
			res = res ^ x[i] ^ y[i-1];
			
		}
		System.out.printf("Missing element in B[] is %d", res);
	}

}
