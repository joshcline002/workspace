import java.util.ArrayList;


public class InsertionSort<E extends Comparable<? super E>> implements  SortAnalysis<E> {
	long startTime;
	long endTime;
	
	public InsertionSort()
	{
		
	}
	
	@Override
	public long analyzeSort(ArrayList<E> list) {
		ArrayList<E> clone = new ArrayList<E>(list.size());
	    for(E item: list) clone.add((E) item);
		startTime = System.currentTimeMillis();
		int i, j;
		for(i = 1; i< clone.size(); i++){
			E obj = clone.get(i);
			j = i;
			
			while(j > 0 && 1 == clone.get(j-1).compareTo(clone.get(i))){
				clone.set(j, clone.get(j-1));
				j--;
			}
			clone.set(j, obj);
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}


}
