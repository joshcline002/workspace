
public class Points_Context {
	
	private FrequentPoints FrequentPoints;
	
	private int totalPoints = 0;
	
	public Points_Context(int points, int age, int categories, boolean New_Releases) {
		
		totalPoints = points;
		
        boolean more = (age<23 && age>17);
        boolean multiple_Categories = categories>1;
        if(more && New_Releases){
        	FrequentPoints = new Points_New_Age();
        } else if(multiple_Categories){
        	FrequentPoints = new Points_Multiple();
        } else{
        	FrequentPoints = new Points_Normal();
        }
    }
    public int execute() {
        return this.FrequentPoints.points(totalPoints);
    }
}
