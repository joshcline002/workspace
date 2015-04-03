
public class DefaultConvo implements Convo {
	private String name;
	
	public DefaultConvo(String n){
		name = n;
	}
	
	@Override
	public void introduction() {
		System.out.println("Hello my name is " + name);
		
	}

	@Override
	public void goodbye() {
		System.out.println("Goodbye");
	}

}
