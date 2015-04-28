
public class ErrorState implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		if(!context.error){
			System.out.println("Incorrect input " + input);
			context.error = true;
		}
	}

}