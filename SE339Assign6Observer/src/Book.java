
public class Book implements Activity {
	private int length;
	private String title;
	
	public Book(String t, int l){
		length = l;
		title = t;
	}
	
	@Override
	public double getPrice() {
		return 0;
		
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