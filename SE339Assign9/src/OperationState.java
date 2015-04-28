
public class OperationState implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		try{
		context.numbers.push(Double.parseDouble(context.num));
		context.num = "";}catch(Exception e){
		}
		context.operation.push(input);
	}

}
