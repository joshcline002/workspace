import java.util.Stack;


public class ResultState implements State {

	@Override
	public void doAction(CalcContext context, String input) {
		int num1 = 0;
		int result = 0;
		String operation = "+";
		Stack<Integer> num = new Stack<Integer>();
		Stack<String> op = new Stack<String>();
		
		num.push(Integer.parseInt(context.num));
		
		while(!context.numbers.isEmpty()){
			num.push(context.numbers.pop());
		}
		
			
		
		while(!context.operation.isEmpty()){
			op.push(context.operation.pop());
		}
			op.push("+");
		
		while(!num.isEmpty()){
			num1 = num.pop();
			operation = op.pop();
			if(operation.compareTo("+")==0){
				result = addition(num1, result);
			}else if(operation.compareTo("-")==0){
				result = subtraction(result, num1);
			}
			
		}
		
		System.out.println("The result = " + result);
		
	}
	
	private int addition(int num1, int num2){
		return num1 + num2;
	}
	
	private int subtraction(int num1, int num2){
		return num1 - num2;
	}

	

}
