
public interface MatrixAnalysis {
/**
 * @param double [][] m1 The first square matrix to multiply
 * 
 * @param double[][] m2 The second square matrix to multiply
 * 
 * @param double [][] m3 The result is placed in teh square matrix m3 = m!
 * 
 * @return long The time in the number of milliseconds for the multiple to complete
 */
	public long analyzeMultiple(double[][] m1, double [][] m2, double[][] m3);
	
/**
 * @param double9090 m1 The square matrix to take the inverse of
 * 
 * @param double[][] m2 The resultant inverse
 * 
 * @return long The time in the number of milliseconds for the multiple to complete
 */
	public long analyzeInverse(double[][] m1, double[][] m2);
}
