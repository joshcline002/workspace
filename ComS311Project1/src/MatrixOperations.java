
public class MatrixOperations implements MatrixAnalysis {
	long startTime;
	long endTime;
	public MatrixOperations(){
		
	}
	
	@Override
	public long analyzeMultiple(double[][] m1, double[][] m2, double[][] m3) {
		startTime = System.currentTimeMillis();
		for (int i = 0; i < m1.length; i++){
			for(int j = 0; j<m2[i].length; j++){
				for(int k = 0; k < m1[i].length; k++){
					m3[i][j] = m3[i][j] + (m1[i][k] * m2[k][j]);
				}
			}
			
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	@Override
	public long analyzeInverse(double[][] m1, double[][] m2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
