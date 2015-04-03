
public class ConvoEnhancer implements Convo {
	protected Convo enhancedConvo;
	
	public ConvoEnhancer(Convo boring){
		enhancedConvo = boring;
	}
	
	public void introduction(){
		enhancedConvo.introduction();
	}
	
	public void goodbye(){
		enhancedConvo.goodbye();
	}
	
	
}
