
public class ObserverTest {

	public static void main(String[] args) {
		MyActivity act = new MyActivity();

		Observer f1 = new FriendOne();
		Observer f2 = new Friend2();
		
		act.add(f1);
		act.add(f2);
		
		act.readBook("Watership Down", 429);
		
		act.watchMovie("Avengers", 120, 12.99);
	}

}
