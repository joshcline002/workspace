
public class ActionConvo extends ConvoEnhancer{

	public ActionConvo(Convo enhancedConvo) {
		super(enhancedConvo);
	}
	
	@Override
	public void introduction(){
		enhancedConvo.introduction();
		System.out.println("and I am about to jump out of a helicopter. While on FIRE!!!");
	}
	
	@Override
	public void goodbye(){
		enhancedConvo.goodbye();
		System.out.println("THUD");
	}

}