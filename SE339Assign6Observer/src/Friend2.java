
public class Friend2 implements Observer {
	Subject activityChooser;
	Activity chose;
	
	public Friend2(){
		
	}
	
	@Override
	public void update() {
		chose = activityChooser.getUpdate(this);
		if(chose instanceof Book){
			System.out.println("Friend2: Man I dont want to read a book. Especially not " + chose.getTitle() + " it's " + chose.getLength() + " pages long.\n");
		} else if (chose instanceof Movie){
			System.out.println("Friend2: Movies are awesome especially " + chose.getTitle() + " it may be " + chose.getLength() + " minutes long");
			System.out.println("and $" + chose.getPrice() +" but thats well worth it.\n");
		}
	}

	@Override
	public void setSubject(Subject sub) {
		this.activityChooser = sub;
		
	}

}
