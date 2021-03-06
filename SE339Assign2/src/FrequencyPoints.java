
public class FrequencyPoints {
    public static final int POINTS_NEW_RELEASE = 1;
    
	public FrequencyPoints() {
		
	}
	
	public int NewReleasePoints(Rental each) {
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		if ((each.getPriceCode() == Movie.NEW_RELEASE) &&
		    (each.getDaysRented() > 1)) {
		        points += POINTS_NEW_RELEASE;
		}
		return points;
	}
	
	public int RegularPoints(Rental each) {
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
	public int ChildrenPoints(Rental each) {
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
}
