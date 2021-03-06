
public class DramaConvo extends ConvoEnhancer{

	public DramaConvo(Convo enhancedIntro) {
		super(enhancedIntro);
	}
	
	@Override
	public void introduction(){
		enhancedConvo.introduction();
		System.out.println("and this is my story. Dun Dun");
	}
	
	@Override
	public void goodbye(){
		System.out.println("...and that is a story for another time so this is me saying.");
		enhancedConvo.goodbye();
	}

}
