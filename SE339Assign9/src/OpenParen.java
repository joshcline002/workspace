
public class OpenParen implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		context.operation.push(input);
		
	}

}
