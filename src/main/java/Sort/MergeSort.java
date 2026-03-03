package Sort;

public class MergeSort {

	private int arrSize;
	private int [] arrAux;
	private int [] arrInput;

	public MergeSort(int [] arrInput){
		this.arrInput = arrInput;
		arrSize = arrInput.length;
		arrAux = new int [arrSize];
	}

	public int[] mergeSorting(){
		long startTime = System.nanoTime();
		//System.out.println("Curentt time:"+startTime);
		sort(0,arrSize-1);
		long endTime = System.nanoTime();
		//System.out.println("end time:"+endTime);

		System.out.println("Time elapsed: "+(endTime-startTime));
		return arrInput;

	}
	public void sort(int low, int high){
		if(low<high){
			int mid = low+((high-low))/2;
			sort(low,mid);
			sort(mid+1,high);
			merge(low, mid, high);			
		}

	}
	public void merge(int low, int mid, int high){
		//copy the entire array in the Auxilary array
		for(int i=low;i<=high;i++){
			arrAux[i] = arrInput[i];
		}
		int i = low;
		int j = mid+1;
		int k = low;

		while(i<=mid && j<=high){
			if(arrAux[i]<=arrAux[j]){
				arrInput[k]=arrAux[i];
				i++;
			}
			else{
				arrInput[k]=arrAux[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arrInput[k]=arrAux[i];
			i++;
			k++;
		}
	}

	public void displayArray(int [] b){
		for(int i=0;i<b.length;i++){
			System.out.print(" " + b[i]);
		}
	}

	public static void main(String[] args){
		int [] a = {6, 2, 4, 12, 10};
		MergeSort m = new MergeSort(a);
		int [] b = m.mergeSorting();
		m.displayArray(b);

	}

}
