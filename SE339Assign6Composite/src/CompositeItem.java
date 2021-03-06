import java.util.ArrayList;


public class CompositeItem implements Item {
	
	private Item parent;
	private ArrayList<Item> children = new ArrayList<Item>();
	
	
	@Override
	public void getTitle() {
		System.out.println("\nComposite\n");
		for(Item child : children){
			child.getTitle();
		}
	}
	
	public void add(Item item){
		item.setParent(this);
		children.add(item);
	}
	
	public void remove(Item item){
		item.setParent(null);
		children.remove(item);
	}

	public Item getChild(int index){
		return children.get(index);
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
