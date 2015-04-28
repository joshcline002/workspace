
public class DecimalState implements State{

	@Override
	public void doAction(CalcContext context, String input) {
		context.num = context.num + input;
	}

}
