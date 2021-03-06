import java.util.Enumeration;
import java.util.Vector;


public class RentalList {
	
	private int movie = 0;
	private int music = 0;
	private int dvd = 0;
	private int cd = 0;
	private int book = 0;
	
	private boolean new_Releases = false;
	
	private int _age;
	
	private Vector<Rental> _rentals = new Vector<Rental>();
	Enumeration<Rental> rentals;
	Rental each;
	double totalAmount;
	int totalPoints;
	public RentalList(int age) {
		_age = age;
	}
	
	public void addRental(Rental arg) {
        _rentals.addElement(arg);
        rentals = _rentals.elements();
        if(arg.type.equalsIgnoreCase("book")){
        	book = 1;
        } else if(arg.type.equalsIgnoreCase("movie")){
        	movie = 1;
        }else if(arg.type.equalsIgnoreCase("music")){
        	music = 1;
        }else if(arg.type.equalsIgnoreCase("dvd")){
        	dvd = 1;
        }else if(arg.type.equalsIgnoreCase("cd")){
        	cd = 1;
        }
        
        if (arg.getPriceCode() == Item.NEW_RELEASE){
        	new_Releases = true;
        }
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
		int categories = music + movie + book + cd + dvd;
		Points_Context point = new Points_Context(totalPoints, _age, categories, new_Releases);
		return point.execute();
	}
	
	public boolean rentalHasNext(){
		return rentals.hasMoreElements();
	}
	
	
}