
public interface Item {
	
	public static final int CHILDRENS   = 2;
	public static final int REGULAR     = 0;
	public static final int NEW_RELEASE = 1;
	
	public int getPriceCode();
	
	public void setPriceCode(int arg);
	
	public String getTitle();
	
	public double getCost(int daysRented);
	
	public int getPoints(int daysRented);
	
	public double buy();

}
