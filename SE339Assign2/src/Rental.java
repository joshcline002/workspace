public class Rental {
    private Movie _movie;
    private int   _daysRented;
    private PriceAmount price = new PriceAmount();
    private FrequencyPoints points = new FrequencyPoints();
    
    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public int getPriceCode(){
    	return _movie.getPriceCode();
    }
    
    public double cost(){
    	return price.rentalPrice(this);
    }
    
    public int getPoints(){
    	int freqPoints = 0;
    	if(_movie.getPriceCode() == Movie.NEW_RELEASE){
    
    		freqPoints = points.NewReleasePoints(this);
    		
    	} else if(_movie.getPriceCode() == Movie.CHILDRENS){
    		
    		freqPoints = points.ChildrenPoints(this);
    	
    	} else if (_movie.getPriceCode() == Movie.REGULAR){
    		
    		freqPoints = points.RegularPoints(this);
    		
    	}
    	
    	return freqPoints;
    }
    
    public String movieTitle(){
    	return _movie.getTitle();
    }
}