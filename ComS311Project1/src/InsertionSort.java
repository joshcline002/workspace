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
		int i, j;
		for(i = 1; i< list.size(); i++){
			E obj = list.get(i);
			j = i;
			
			while(j > 0 && (list.get(j-1).compareTo(obj) > 0)){
				list.set(j, list.get(j-1));
				j--;
			}
			list.set(j, obj);
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}


}
