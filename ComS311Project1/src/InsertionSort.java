import java.util.ArrayList;


public class InsertionSort<E extends Comparable<? super E>> implements  SortAnalysis<E> {
	long startTime;
	long endTime;
	
	public InsertionSort()
	{
		
	}
	
	@Override
	public long analyzeSort(ArrayList<E> list) {
		startTime = System.currentTimeMillis();
		int i;
		int j;
		int size = list.size()-1;
		for(i = 1; i<= size; i++){
			E obj = list.get(i);
			j = i-1;
			
			while(j > 0 && (list.get(j).compareTo(obj) > 0)){
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, obj);
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}


}
