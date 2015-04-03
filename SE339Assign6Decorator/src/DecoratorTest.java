
public class DecoratorTest {

	public static void main(String[] args) {
		Convo basic = new DefaultConvo("Josh");
		
		Convo awesome = new ActionConvo(basic);
		
		Convo dundun = new DramaConvo(basic);
		
		System.out.println("Normal hello");
		basic.introduction();
		
		System.out.println("\nNormal goodbye");
		basic.goodbye();
		
		System.out.println("\nHello with action decorator");
		awesome.introduction();
		
		System.out.println("\nGoodbye with action decorator");
		awesome.goodbye();
		
		System.out.println("\nHello with drama decorator");
		dundun.introduction();

		System.out.println("\nGoodbye with drama decorator");
		dundun.goodbye();
	}

}
