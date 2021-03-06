
public class Childrens implements Item {
	
	protected Item pricingItem;
	
	private int DAYS_CHILDREN_BOOKS = 7;
	private int DAYS_CHILDREN_CDs = 5;
	private int DAYS_CHILDREN_DVDs = 4;
	private int DAYS_CHILDREN_MOVIE = 3;
	private int DAYS_CHILDREN_MUSIC = 3;
	
	public Childrens(Item pricingItem){
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
	
	private int getBooksPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
	private int getCDsPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}

	private int getDVDsPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
	private int getMoviePoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
	private int getMusicPoints(int daysRented){
		int points = 0;
		// add frequent renter points
		points++;
		return points;
	}
	
	private double getBooksRentPrice(int daysRented){
		double thisAmount = 1;
        if (daysRented > DAYS_CHILDREN_BOOKS) {
            thisAmount += (daysRented - DAYS_CHILDREN_BOOKS) * 1.5;
        }
        return thisAmount;
	}
	
	private double getCDsRentPrice(int daysRented){
		double thisAmount = 1.25;
        if (daysRented > DAYS_CHILDREN_CDs) {
            thisAmount += (daysRented - DAYS_CHILDREN_CDs) * 1.5;
        }
        return thisAmount;
	}

	private double getDVDsRentPrice(int daysRented){
		double thisAmount = 2;
        if (daysRented > DAYS_CHILDREN_DVDs) {
            thisAmount += (daysRented - DAYS_CHILDREN_DVDs) * 1.5;
        }
        return thisAmount;
	}
	
	private double getMovieRentPrice(int daysRented){
		double thisAmount = 1.5;
        if (daysRented > DAYS_CHILDREN_MOVIE) {
            thisAmount += (daysRented - DAYS_CHILDREN_MOVIE) * 1.5;
        }
        return thisAmount;
	}
	
	private double getMusicRentPrice(int daysRented){
		double thisAmount = 1;
        if (daysRented > DAYS_CHILDREN_MUSIC) {
            thisAmount += (daysRented - DAYS_CHILDREN_MUSIC) * 1.5;
        }
        return thisAmount;
	}

	@Override
	public double buy() {
		return pricingItem.buy();
	}
}
