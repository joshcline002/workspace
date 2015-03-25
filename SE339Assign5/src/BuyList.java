import java.util.Enumeration;
import java.util.Vector;


public class BuyList {
	private Vector<Item> _Item = new Vector<Item>();
	Enumeration<Item> items;
	Item each;
	double totalAmount = 0;
	
	public BuyList() {
	}
	
	public void buyItem(Item arg) {
        _Item.addElement(arg);
        items = _Item.elements();
    }
	
	public double buy(){
		each  = (Item) items.nextElement();
		totalAmount += each.buy();
		 return each.buy();
	}
	
	public int priceCode(){
		return each.getPriceCode();
	}
	
	public double getTotalAmount(){
		return totalAmount;
	}
	
	public String title(){
		return each.getTitle();
	}
	
	public boolean purchaseHasNext(){
		return items.hasMoreElements();
	}
	
}
