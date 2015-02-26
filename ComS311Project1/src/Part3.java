import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Part3 {
	
public static void main(String[] args) throws IOException {
	boolean found = true;
	ArrayList<Integer> list = new ArrayList<Integer>();
	int size = 0;
	long time = 0;
	int j = 0;
	
	File f = new File("QuickSortWorstTimes.txt");
	File g = new File("QuickSortRandomTimes.txt");
	BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	BufferedWriter bw2 = new BufferedWriter(new FileWriter(g)); 
	QuickSort sort = new QuickSort();
	Random ranNum = new Random();
	
	int max;
	int min = 0;
	int mid;
	int i = 2;
	found = true;
	
	while(found){
		list.clear();
		for(j =0; j< i; j++){
			list.add(ranNum.nextInt());
		}
		time = sort.analyzeSort(list);
		System.out.println("size =" + i + "Time =" + time);
		if(time > 1000){
			found = false;
			size = i;
		} else {
			i = i*2;
		}
	}
		found = true;
		max = size;
		while(found){
			if(max < min){
				found = false;
			} else{
				mid = (max - min)/2 + min;
				list.clear();
				for(int k = 0; k<mid; k++){
					list.add(ranNum.nextInt());
				}
				time = sort.analyzeSort(list);
				System.out.println("BS time" + time);
				if(time>1002){
					size = mid;
					max = mid+1;
				} else if(time<998){
					size = mid;
					min = mid-1;
				} else {
					size = mid;
					found = false;
				}
			}
		list.clear();
		j=0;
	}
	list.clear();
	j = 0;
	System.out.println("Found size =" + size + "Time =" + time);
	int timing;
	
	i = 1;
	for(int k =  0; k<100; k++){
		while(j<i){
			list.add(i-j);
			j++;
		}
		time = sort.analyzeSort(list); 
		timing = (int)time;
		System.out.println("time" + timing + "size" + i);
		bw.write(timing + "");
		bw.newLine();
		i = i+size/100;
		list.clear();
		j = 0;
			
	}
	bw.close();
	i = 1;
	j = 0;
	for(int k =  0; k<100; k++){
		while(j<i){
			list.add(ranNum.nextInt());
			j++;
		}
		time = sort.analyzeSort(list); 
		timing = (int)time;
		System.out.println("time" + timing + "size" + i);
		bw2.write(timing + "");
		bw2.newLine();
		i = i+size/100;
		list.clear();
		j = 0;
	}
	bw2.close();
	}
}
