public class Rental {
    private Item item_;
    private int   _daysRented;
    
    public Rental(Item item, int daysRented) {
        item_      = item;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public int getPriceCode(){
    	return item_.getPriceCode();
    }
    
    public double cost(){
    	return item_.getCost(_daysRented);
    }
    
    public int getPoints(){
    	int freqPoints = 0;
    	freqPoints = item_.getPoints(_daysRented);
    	
    	return freqPoints;
    }
    
    public String movieTitle(){
    	return item_.getTitle();
    }
}