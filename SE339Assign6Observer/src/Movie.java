
public class Movie implements Activity {
	private String title;
	private int length;
	private double price;
	
	public Movie(String t, int l, double p){
		title = t;
		length = l;
		price = p;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public int getLength() {
		return length;
	}

}
