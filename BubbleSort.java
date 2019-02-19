public class BubbleSort implements SortingAlgorithm{
	void swap(int [] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	@Override
	public void sort(int []a){
		boolean swapped = true;
		for(int j=0; j<(a.length-1)&&swapped; j++){
			for(int i=0; i<(a.length-j-1);i++){ 
				if(a[i]>a[i+1]){ //so it won't go out of bounds
					swap(a,i,i+1);
					swapped = true;
				}
			}
		}
	}
}