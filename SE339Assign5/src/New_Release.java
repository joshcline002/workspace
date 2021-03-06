
public class New_Release implements Item {

	protected Item pricingItem;

	private int DAYS_NEW_RELEASE_BOOKS = 4;
	private int DAYS_NEW_RELEASE_CDs = 2;
	private int DAYS_NEW_RELEASE_DVDs = 1;
	private int DAYS_NEW_RELEASE_MOVIE = 1;
	private int DAYS_NEW_RELEASE_MUSIC = 2;
	
	public New_Release(Item pricingItem){
		this.pricingItem = pricingItem;
	}
	
	@Override
	public int getPriceCode() {
		return pricingItem.getPriceCode();
	}

	@Override
	public void setPriceCode(int arg) {
		 pricingItem.setPriceCode(arg);
	}

	@Override
	public String getTitle() {
		return pricingItem.getTitle();
	}

	@Override
	public double getCost(int daysRented) {
		double result = 0;
		if (pricingItem instanceof Books){
			result = this.getBooksRentPrice(daysRented);
		} else if (pricingItem instanceof CDs){
			result = this.getCDsRentPrice(daysRented);
		} else if (pricingItem instanceof DVDs){
			result = this.getDVDsRentPrice(daysRented);
		} else if (pricingItem instanceof Movie){
			result = this.getMovieRentPrice(daysRented);
		} else if (pricingItem instanceof Music){
			result = this.getMusicRentPrice(daysRented);
		}
		return result;
	}

	@Override
	public int getPoints(int daysRented) {
		int result = 0;
		if (pricingItem instanceof Books){
			result = this.getBooksPoints(daysRented);
		} else if (pricingItem instanceof CDs){
			result = this.getCDsPoints(daysRented);
		} else if (pricingItem instanceof DVDs){
			result = this.getDVDsPoints(daysRented);
		} else if (pricingItem instanceof Movie){
			result = this.getMoviePoints(daysRented);
		} else if (pricingItem instanceof Music){
			result = this.getMusicPoints(daysRented);
		}
		return result;
	}
	
	@Override
	public double buy() {
		return pricingItem.buy();
	}
	
	private int getBooksPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		    if(daysRented > (DAYS_NEW_RELEASE_BOOKS)) {
		        points ++;;
		}
		return points;
	}
	
	private int getCDsPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		    if(daysRented > (DAYS_NEW_RELEASE_CDs)) {
		        points ++;;
		}
		return points;
	}

	private int getDVDsPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		    if(daysRented > (DAYS_NEW_RELEASE_DVDs)) {
		        points ++;;
		}
		return points;
	}
	
	private int getMoviePoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		    if(daysRented > (DAYS_NEW_RELEASE_MOVIE)) {
		        points ++;;
		}
		return points;
	}
	
	private int getMusicPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		
		// add bonus for a two day new release rental
		    if(daysRented > (DAYS_NEW_RELEASE_MUSIC)) {
		        points ++;;
		}
		return points;
	}
	
	private double getBooksRentPrice(int daysRented){
		double thisAmount = 2;
        if (daysRented > DAYS_NEW_RELEASE_BOOKS) {
            thisAmount += (daysRented - DAYS_NEW_RELEASE_BOOKS) * 3;
        }
        return thisAmount;
	}
	
	private double getCDsRentPrice(int daysRented){
		double thisAmount = 2.5;
        if (daysRented > DAYS_NEW_RELEASE_CDs) {
            thisAmount += (daysRented - DAYS_NEW_RELEASE_CDs) * 3;
        }
        return thisAmount;
	}

	private double getDVDsRentPrice(int daysRented){
		double thisAmount = 3;
		 if (daysRented > (DAYS_NEW_RELEASE_DVDs)) {
	            thisAmount += (daysRented - DAYS_NEW_RELEASE_DVDs) * 3;
	     }
		return thisAmount;
	}
	
	private double getMovieRentPrice(int daysRented){
		double thisAmount = 3;
		 if (daysRented > (DAYS_NEW_RELEASE_MOVIE)) {
	            thisAmount += (daysRented - DAYS_NEW_RELEASE_MOVIE) * 3;
	     }
		return thisAmount;
	}
	
	private double getMusicRentPrice(int daysRented){
		double thisAmount = 1.5;
        if (daysRented > DAYS_NEW_RELEASE_MUSIC) {
            thisAmount += (daysRented - DAYS_NEW_RELEASE_MUSIC) * 1.5;
        }
        return thisAmount;
	}
}
