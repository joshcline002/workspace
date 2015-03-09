
public class NumberState implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		context.num = context.num + input;
	}

}
