
public class OperationState implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		
		context.numbers.push(Integer.parseInt(context.num));
		context.num = "";
		context.operation.push(input);
	}

}