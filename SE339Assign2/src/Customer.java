import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Customer {
    private String _name;
    private RentalList _rentals = new RentalList();
    BufferedWriter bw;
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addRental(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() throws IOException {
        String      result               = "Rental Record for " + getName() + "\n";
        htmlBeginStatement();
        while (_rentals.rentalHasNext()) {
            double thisAmount = 0;
            
            // determine amounts for each line
            thisAmount = _rentals.rentalAmount();
            
            // show figures for this rental
            result = movieResult(result, thisAmount);
            htmlAddition(thisAmount);
        }
        
        // add footer lines
        result = footerResult(result);
        htmlEnd();
        return result;
    }
    
    private void htmlBeginStatement() throws IOException{
    	 File f = new File(getName() + "Statement.htm");
    	 bw = new BufferedWriter(new FileWriter(f));
         String beginPage = "<!DOCTYPE html> <html> <head> <title> Movie Rental Statement </title> </head> <body> <h1> Rental Record for " + getName() + "</h1>";
         bw.write(beginPage);
         bw.newLine();
    }
    
    private void htmlAddition(double amount) throws IOException{
    	String addition = "<p>    " + _rentals.movieTitle() + "    " + String.valueOf(amount) + "</p>";
    	bw.write(addition);
    	bw.newLine();
    }
    
    private void htmlEnd() throws IOException{
    	String end1 = "<h3> Amount owed is " + String.valueOf(_rentals.getTotalAmount() + "</h3>");
    	bw.write(end1);
    	bw.newLine();
    	String end2 = "<h3> You earned " + String.valueOf(_rentals.getPoints()) + " frequent renter points </h3>";
    	bw.write(end2);
    	bw.close();
    }
   

	private String footerResult(String result) {
		result += "Amount owed is " + String.valueOf(_rentals.getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(_rentals.getPoints()) +
                " frequent renter points";
		return result;
	}

	
	private String movieResult(String result, double thisAmount) {
		result += "\t" + _rentals.movieTitle() +
		          "\t" + String.valueOf(thisAmount) + "\n";
		return result;
	}
}