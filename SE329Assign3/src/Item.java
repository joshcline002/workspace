
public interface Item {
	
	
	public int getPriceCode();
	
	public void setPriceCode(int arg);
	
	public String getTitle();
	
	public double getCost(int daysRented);
	
	public int getPoints(int daysRented);

}