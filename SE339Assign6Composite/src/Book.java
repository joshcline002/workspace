
public class Book implements Item{
	private Item parent;
	private String name;
	
	public Book(String n){
		name = n;
	}
	
	@Override
	public void getTitle() {
		System.out.println("Book name is " + name);
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
