import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Part2a {

	public static void main(String[] args) throws IOException {
		boolean found = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = 0;
		long time;
		int j = 0;
		int numTimes=0;
		int avgSize = 0;
		File f = new File("InsertionSortWorstTimes.txt");
		File g = new File("InsertionSortRandomTimes.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(g)); 
		InsertionSort sort = new InsertionSort();
		Random ranNum = new Random();
		while(numTimes<5){
		int i = 2;
		found = true;
		while(found){
			while(j<i){
				try{
				list.add(ranNum.nextInt());
				j++;
				}catch (OutOfMemoryError e){
				}
			}
			time = sort.analyzeSort(list);

			if(time > 1000){
				found = false;
				size = i;
			} else if( time > 500 ){
				i++;
			}else{
				i = i*2;
			}
		}
		list.clear();
		j = 0;
		System.out.println("Found size =" + size);
		avgSize += size;
		numTimes++;
	}
		int timing;
		size = avgSize/numTimes;
		System.out.println("Found Average Size =" + size);
		int i = 1;
		for(int k =  0; k<size; k++){
			while(j<i){
				list.add(i-j);
				j++;
			}
			time = sort.analyzeSort(list); 
			timing = (int)time;
			System.out.println("time" + timing + "size" + i);
			bw.write(timing);
			bw.newLine();
				i = i+100;
				
		}
		bw.close();
		
		i = 1;
		for(int k =  0; k<size; k++){
			while(j<i){
				list.add(ranNum.nextInt());
				j++;
			}
			time = sort.analyzeSort(list); 
			bw2.write((int) time);
			bw2.newLine();
				i = i+100;
				
		}
		bw2.close();
	}
}


