
public class CompositeTest {

	public static void main(String[] args) {
		
		CompositeItem everything = new CompositeItem();
		CompositeItem movies = new CompositeItem();
		CompositeItem actionMovies = new CompositeItem();
		CompositeItem dramaMovies = new CompositeItem();
		CompositeItem books = new CompositeItem();
		
		Movie avengers = new Movie("Avengers");
		Movie hulk = new Movie("Hulk");
		Movie shooter = new Movie("Shooter");
		Movie bourne = new Movie("Bourne");
		
		Movie crash = new Movie("Crash");
		Movie lesMis = new Movie("Les Miserables");
		Movie godfather = new Movie("The Godfather");
		
		Book watership = new Book("WaterShip Down");
		Book night = new Book("Night");
		
		actionMovies.add(avengers);
		actionMovies.add(hulk);
		actionMovies.add(shooter);
		actionMovies.add(bourne);
		
		dramaMovies.add(crash);
		dramaMovies.add(lesMis);
		dramaMovies.add(godfather);
		
		books.add(watership);
		books.add(night);
		
		movies.add(actionMovies);
		movies.add(dramaMovies);
		
		everything.add(books);
		everything.add(movies); 
		
		if(actionMovies.getParent().equals(movies)){
			System.out.println("The parent of action movies is the the corret one which is movies\n");
		}
		
		if(everything.getChild(0).equals(books)){
			System.out.println("The child at index 0 of everything is correct equaling books\n");
		}
		
		everything.getTitle();

	}

}
