public class Rental {
    private Item item_;
    private int   _daysRented;
    public String type;
    
    public Rental(Item item, int daysRented) {
    	if (item instanceof Books){
			type = "book";
		} else if (item instanceof CDs){
			type = "cd";
		} else if (item instanceof DVDs){
			type = "dvd";
		} else if (item instanceof Movie){
			type = "movie";
		} else if (item instanceof Music){
			type = "music";
		}
    	
    	if(item.getPriceCode() == Item.CHILDRENS){
    		item_ = new Childrens(item);
    	} else if (item.getPriceCode() == Item.REGULAR){
    		item_ = new Regular(item);
    	} else if (item.getPriceCode() == Item.NEW_RELEASE){
    		item_ = new New_Release(item);
    	}
    	
        _daysRented = daysRented;
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