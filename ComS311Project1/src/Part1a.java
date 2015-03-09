import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Part1a {

	public static void main(String[] args) throws IOException {
		MatrixOperations op = new MatrixOperations();
		Random ranNum = new Random();
		boolean found = true;
		File g = new File("MatrixOperations.txt");
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(g)); 
		int i = 1;
		int size = 1;
		int mid;
		int min = 0;
		int max;
		while (found){
			double[][] m1 = new double[i][i];
			double[][] m2 = new double[i][i];
			double[][] m3 = new double[i][i];
			
			for(int k = 0; k<i; k++){
				for(int j = 0; j<i; j++){
				m1[k][j] = ranNum.nextInt(10);
				m2[k][j] = ranNum.nextInt(10);
				}
			}
			
			if(op.analyzeMultiple(m1, m2, m3) > 1000){
				found = false;
				size = i;
			} else {
				i = i*2;
			}
			
		}
		System.out.println("Found size =" + size);
		max = size;
		found = true;
		while(found){
			if(max < min){
				found = false;
			} else{
				mid = (max - min)/2 + min;
				
				double[][] m1 = new double[mid][mid];
				double[][] m2 = new double[mid][mid];
				double[][] m3 = new double[mid][mid];
				
				for(int k = 0; k<mid; k++){
					for(int j = 0; j<mid; j++){
					m1[k][j] = ranNum.nextInt(10);
					m2[k][j] = ranNum.nextInt(10);
					}
				}
				
				if(op.analyzeMultiple(m1, m2, m3)>1000){
					size = mid;
					max = mid+1;
				} else if(op.analyzeMultiple(m1, m2, m3)<1000){
					size = mid;
					min = mid-1;
				} else {
					size = mid;
					found = false;
				}
			}
		}
		System.out.println("Found size = " + size);
	int timing;
	for(int j = 0; j<size; j++){
		double[][] m1 = new double[j][j];
		double[][] m2 = new double[j][j];
		double[][] m3 = new double[j][j];
		timing = (int)op.analyzeMultiple(m1, m2, m3);
		System.out.println(timing);
		bw2.write(timing + "");
		bw2.newLine();
		}
		bw2.close();
		System.out.println("Done");
	}
}