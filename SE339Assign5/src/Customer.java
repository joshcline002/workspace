import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Customer {
    private String _name;
    private RentalList _rentals = new RentalList();
    private BuyList _bought = new BuyList();
    BufferedWriter bw;
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addRental(arg);
    }
    
    public void purchase(Item arg){
    	_bought.buyItem(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() throws IOException {
        String      result               = "Rental Record for " + getName() + "\n";
        htmlBeginStatement();
        
        if(_rentals.rentals != null){
        	while (_rentals.rentalHasNext()) {
            	double thisAmount = 0;
            
            	// determine amounts for each line
            	thisAmount = _rentals.rentalAmount();
            
            	// show figures for this rental
            	result = movieResult(result, thisAmount);
            	htmlAddition(thisAmount);
        	}
        }
        
        if(_bought.items != null){
        	while(_bought.purchaseHasNext()){
        		double price = _bought.buy();
        		String title = _bought.title();
        		
        		result += "\t" + title +
        				"\t" + String.valueOf(price) + "\n";
        	
        		bw.write("<p>    " + title + "    " + String.valueOf(price) + "</p>");
        		bw.newLine();
        	}
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
    	String addition = "<p>    " + _rentals.title() + "    " + String.valueOf(amount) + "</p>";
    	bw.write(addition);
    	bw.newLine();
    }
    
    private void htmlEnd() throws IOException{
    	String end1 = "<h3> Amount owed is " + String.valueOf(_rentals.getTotalAmount() + _bought.getTotalAmount()) + "</h3>";
    	bw.write(end1);
    	bw.newLine();
    	String end2 = "<h3> You earned " + String.valueOf(_rentals.getPoints()) + " frequent renter points </h3>";
    	bw.write(end2);
    	bw.close();
    }
   

	private String footerResult(String result) {
		result += "Amount owed is " + String.valueOf(_rentals.getTotalAmount() + _bought.getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(_rentals.getPoints()) +
                " frequent renter points";
		return result;
	}

	
	private String movieResult(String result, double thisAmount) {
		result += "\t" + _rentals.title() +
		          "\t" + String.valueOf(thisAmount) + "\n";
		return result;
	}
}