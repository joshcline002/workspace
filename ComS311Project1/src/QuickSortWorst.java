import java.util.ArrayList;
import java.util.Stack;


public class QuickSortWorst <E extends Comparable<? super E>> implements SortAnalysis<E> {
	
	@Override
	public long analyzeSort(ArrayList<E> list) {
		long endTime;
		long startTime = System.currentTimeMillis();
		int p;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		stack.push(list.size()-1);
		
		while(!stack.isEmpty()){
			int end = stack.pop();
			int start = stack.pop();
			if ((end - start)<1){
				continue;
			}
			
			p = partition(list, start, end);
			
			stack.push(p);
			stack.push(end);
			
			stack.push(start);
			stack.push(p-1);
		}
		
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	private int partition(ArrayList<E> list, int left, int right ){
		int l = left;
		int r = right;
		E pivot = list.get(left);
		E tmp;

		while(r >= l){
			
			while(list.get(l).compareTo(pivot)<0){
				l++;
			}
			
			while(list.get(r).compareTo(pivot)>0){
				r--;
			}
			
			if(r>=l){
				tmp = list.get(l);
				list.set(l, list.get(r));
				list.set(r, tmp);
				l++;
				r--;
			}
		}
		
		return l;
	}

}
