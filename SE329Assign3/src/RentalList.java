import java.util.Enumeration;
import java.util.Vector;


public class RentalList {
	private Vector<Rental> _rentals = new Vector<Rental>();
	Enumeration<Rental> rentals;
	Rental each;
	double totalAmount;
	int totalPoints;
	public RentalList() {
	}
	
	public void addRental(Rental arg) {
        _rentals.addElement(arg);
        rentals = _rentals.elements();
    }
	
	public double rentalAmount(){
		each  = (Rental) rentals.nextElement();
		 double amount = each.cost();
		 totalPoints += each.getPoints();
		 totalAmount += amount;
		return amount;
	}
	
	public int priceCode(){
		return each.getPriceCode();
	}
	
	public double getTotalAmount(){
		return totalAmount;
	}
	
	public String title(){
		return each.movieTitle();
	}
	
	public int getPoints(){
		return totalPoints;
	}
	
	public boolean rentalHasNext(){
		return rentals.hasMoreElements();
	}
	
	
}