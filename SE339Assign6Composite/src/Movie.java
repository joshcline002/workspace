
public class Movie implements Item{
	private Item parent;
	private String name;
	
	public Movie(String n){
		name = n;
	}
	
	@Override
	public void getTitle() {
		System.out.println("Movie name is " + name);
	}

	@Override
	public void setParent(Item p) {
		parent = p;
	}

	@Override
	public Item getParent() {
		return parent;
	}

}
