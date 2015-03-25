
public class PriceAmount {
	double thisAmount;
	public static final int DAYS_CHILDRENS   = 3;
    public static final int DAYS_REGULAR     = 2;
    public static final int DAYS_NEW_RELEASE = 0;
    
	public PriceAmount() {
	}
	
	public double rentalPrice(Rental each) {
		if (each.getPriceCode() == Movie.REGULAR){
		
			movieRegular(each.getDaysRented());
			
		} else if(each.getPriceCode() == Movie.NEW_RELEASE){
			
			movieNewRelease(each.getDaysRented());
			
		}else if(each.getPriceCode() == Movie.CHILDRENS){
			
			movieChildrens(each.getDaysRented());
		
		}
		return thisAmount;
	}
	
	private void movieChildrens(int daysRented){
		thisAmount = 1.5;
        if (daysRented > DAYS_CHILDRENS) {
            thisAmount += (daysRented - DAYS_CHILDRENS) * 1.5;
        }
	}
	
	private void movieRegular(int daysRented){
		thisAmount = 2;
        if (daysRented > DAYS_REGULAR) {
            thisAmount += (daysRented - DAYS_REGULAR) * 1.5;
        }
	}
	
	private void movieNewRelease(int daysRented){
		thisAmount = (daysRented - DAYS_NEW_RELEASE) * 3;
	}
	
}
