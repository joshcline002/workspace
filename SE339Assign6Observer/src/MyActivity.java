import java.util.ArrayList;
import java.util.List;




public class MyActivity implements Subject {
	private ArrayList<Observer> friends = new ArrayList<Observer>();
	private Activity activity;
	
	@Override
	public void add(Observer obj) {
		
		if(!friends.contains(obj)){
			friends.add(obj);	
			obj.setSubject(this);
		}
	}

	@Override
	public void remove(Observer obj) {
		if(friends.contains(obj)){
			friends.remove(obj);
		}
		
	}

	@Override
	public void notifyObservers() {
		List<Observer> temp = new ArrayList<>(friends);
		for(Observer obj : temp){
			obj.update();
		}
		
	}

	@Override
	public Activity getUpdate(Observer obj) {
		return activity;
	}
	
	public void watchMovie(String name, int length, double price){
		activity = new Movie(name, length, price);
		System.out.println("Me: I want to watch " + name + " its $" + price + " and " + length + " minutes long.\n");
		notifyObservers();
	}
	
	public void readBook(String name, int length){
		activity = new Book(name, length);
		System.out.println("Me: I want to read " + name + " even though its " + length + " pages long\n");
		notifyObservers();
	}

}
