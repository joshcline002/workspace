import java.util.Stack;


public class CloseParen implements State {

	@Override
	public void doAction(CalcContext context, String input) {
			
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double result = 0;
		String operation = "+";
		String operation2 = null;
		Stack<Double> num = new Stack<Double>();
		Stack<String> op = new Stack<String>();
		
		try{
		context.numbers.push(Double.parseDouble(context.num));
		context.num = "";
		}catch(Exception e){
			
		}
		while(!operation.equalsIgnoreCase("(")){
			op.push(operation);
			num.push(context.numbers.pop());
			operation = context.operation.pop();
		}
			
		op.push("+");
		
		while(!num.isEmpty()){
			operation2 = null;
			num1 = num.pop();
			operation = op.pop();
			if(!op.isEmpty() && !(operation.compareTo("*")==0 || operation.compareTo("/")==0 )){
				operation2 = op.pop();
			}
			
			
			while(operation2 != null){
				if(operation2.compareTo("*")==0){
					num2 = num.pop();
					num3 = multiplication(num2, num1);
				
				} else if(operation2.compareTo("/")==0){
					num2 = num.pop();
					num3 = division(num2, num1);
				}
				
				if(!(operation2.compareTo("*")==0 || operation2.compareTo("/")==0)){
					op.push(operation2);
					operation2 = null;
				}else{
					num1 = num3;
					if(!op.isEmpty()){
						operation2 = op.pop();
					} else {
						operation2 = null;
					}
				}
			}
			
			if(operation.compareTo("+")==0){
				result = addition(num1, result);
			}else if(operation.compareTo("-")==0){
				result = subtraction(result, num1);
			}else if(operation.compareTo("*")==0){
				result = multiplication(result, num1);
			} else if(operation.compareTo("/")==0){
				result = division(num1, result);
			}
		
	}
	
	context.numbers.push(result);
	
}

private double addition(double num1, double num2){
	return num1 + num2;
}

private double subtraction(double num1, double num2){
	return num1 - num2;
}

private double multiplication(double num1, double num2){
	return num1 * num2;
}

private double division(double num1, double num2){
	return num2 / num1;
}

		
}