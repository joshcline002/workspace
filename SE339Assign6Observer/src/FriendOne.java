
public class FriendOne implements Observer {
	private Subject activityChooser;
	private Activity chose;
	
	public FriendOne(){
		
	}
	
	@Override
	public void update() {
		chose = activityChooser.getUpdate(this);
		if(chose instanceof Book){
			System.out.println("Friend1: A book is a good chose it will help save money since it is $" + chose.getPrice() + " plus " + chose.getTitle());
			System.out.println("is a great book even if its " + chose.getLength() + " pages long.\n");
		} else if (chose instanceof Movie){
			System.out.println("Friend1: Movies are expensive its $" + chose.getPrice() + " that to much for a " + chose.getLength() + " minutes movie");
			System.out.println("even if " + chose.getTitle() + " is a great movie\n");
		}
	}

	@Override
	public void setSubject(Subject sub) {
		this.activityChooser = sub;
		
	}

}
