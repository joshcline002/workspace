public class Movie implements Item {


    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    private int    _priceCode;
    
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    
    @Override
    public int getPriceCode() {
        return _priceCode;
    }
    
    @Override
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    
    @Override
    public String getTitle() {
        return _title;
    }

	@Override
	public double getCost(int daysRented) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPoints(int daysRented) {
		// TODO Auto-generated method stub
		return 0;
	}

}
