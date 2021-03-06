import java.io.IOException;


public class MovieSystem {

	public static void main(String[] args) throws IOException {
		Customer cust1 = new Customer("Child");
		Customer cust2 = new Customer("Reg");
		Customer cust3 = new Customer("New");
		
		Customer custLate1 = new Customer("LateChild");
		Customer custLate2 = new Customer("LateReg");
		Customer custLate3 = new Customer("LateNew");
		
		Customer custMix = new Customer("complex");
		
		Customer custMix1 = new Customer("moreComplex");
		
		Customer multiCat1 = new Customer("multiCategory");
		
		Books bReg = new Books("Banana", 0, 5.99);
		CDs cReg = new CDs("Hamock", 0, 5.99);
		DVDs dReg = new DVDs("Scrubs", 0, 10.99);
		
		Movie child = new Movie("Titans", 2, 13.99);
		Movie reg = new Movie("Red", 0, 12.99);
		Movie newRelease = new Movie ("Avengers", 1, 12.99);
		Movie diff1 = new Movie("one", 1, 11.99);
		Movie diff2 = new Movie("two", 2, 12.99);

		Rental bRent = new Rental(bReg, 1);
		Rental cRent = new Rental(cReg, 1);
		Rental dRent = new Rental(dReg, 1);
		
		Rental rent1 = new Rental(child, 1);
		Rental rent2 = new Rental(reg, 1);
		Rental rent3 = new Rental(newRelease, 1);
		
		Rental late1 = new Rental(child,4);
		Rental late2 = new Rental(reg, 3);
		Rental late3 = new Rental(newRelease, 2);
		
		Rental late4 = new Rental(diff1, 10);
		Rental late5 = new Rental(diff2, 20);
		
		multiCat1.addRental(dRent);
		multiCat1.addRental(cRent);
		multiCat1.addRental(bRent);
		
		cust1.addRental(rent1);
		cust2.addRental(rent2);
		cust3.addRental(rent3);
		
		custLate1.addRental(late1);
		custLate2.addRental(late2);
		custLate3.addRental(late3);
		
		custMix.addRental(rent1);
		custMix.addRental(late2);
		custMix.addRental(rent3);
		custMix.addRental(late3);
		
		custMix1.addRental(rent1);
		custMix1.addRental(rent2);
		custMix1.addRental(rent3);
		custMix1.addRental(late1);
		custMix1.addRental(late2);
		custMix1.addRental(late3);
		custMix1.addRental(late4);
		custMix1.addRental(late5);
		custMix1.purchase(child);
		
		System.out.println(cust1.statement() + "\n");
		System.out.println(cust2.statement() + "\n");
		System.out.println(cust3.statement() + "\n");
		
		System.out.println(custLate1.statement() + "\n");
		System.out.println(custLate2.statement() + "\n");
		System.out.println(custLate3.statement() + "\n");
		
		System.out.println(custMix.statement() + "\n");
		
		System.out.println(custMix1.statement() + "\n");
		
		System.out.println(multiCat1.statement() + "\n");
	}


}

