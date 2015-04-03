
public interface Subject {

	public void add(Observer obj);
	public void remove(Observer obj);
	
	public void notifyObservers();
	
	public Activity getUpdate(Observer obj);
}
