
public class Books implements Item{
	
	 private String _title;
	    private int    _priceCode;
	    
	    public Books(String title, int priceCode) {
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