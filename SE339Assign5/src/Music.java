
public class Music implements Item {
	
	public static final int CHILDRENS   = 2;
	public static final int REGULAR     = 0;
	public static final int NEW_RELEASE = 1;
 
	private String _title;
	private int    _priceCode;
	private double _cost;
	    
	    public Music(String title, int priceCode, double cost) {
	        _title = title;
	        _priceCode = priceCode;
	        _cost = cost;
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

	@Override
	public double buy() {
		return _cost;
	}
	
	

}
