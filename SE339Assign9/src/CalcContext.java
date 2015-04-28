import java.util.Stack;


public class CalcContext implements State{
	
	private State state;
	public Stack<String> operation = new Stack<String>();
	public Stack<Double> numbers = new Stack<Double>();
	public String num = "";
	public Boolean error = false;
	
	public CalcContext(){
		state = new StartState();
	}
	
	public void setState(String c){
		
		double digit = -1;
	try{	
		digit = Double.parseDouble(c);
	}catch(Exception e){
		
	}
		if(c.compareTo("-") == 0 || c.compareTo("+") == 0 || c.compareTo("/") == 0 || c.compareTo("*") == 0 ){
			
			if(this.state instanceof NumberState || this.state instanceof CloseParen || this.state instanceof AfterDecimal) {
				this.state = new OperationState();
			}else{
				this.state = new ErrorState();
			}
			
		}else if(digit < 10 && digit >= 0 && !(this.state instanceof AfterDecimal || this.state instanceof DecimalState)){
			
			if(this.state instanceof StartState || this.state instanceof NumberState || this.state instanceof OperationState || this.state instanceof OpenParen){
				this.state = new NumberState();
			}else{
				this.state = new ErrorState();
			}
			
		}else if(digit < 10 && digit >= 0   && (this.state instanceof AfterDecimal || this.state instanceof DecimalState)){
			
				this.state = new AfterDecimal();
			
		}else if(c.compareTo("(") == 0 ){
			
			if(this.state instanceof StartState ||this.state instanceof OperationState || this.state instanceof OpenParen){
				this.state = new OpenParen();
			}else{
				this.state = new ErrorState();
			}
			
		}else if(c.compareTo(")") == 0 ){
			
			if(this.state instanceof NumberState ||this.state instanceof AfterDecimal || this.state instanceof CloseParen){
				this.state = new CloseParen();
			}else{
				this.state = new ErrorState();
			}
			
		}else if(c.compareTo(".") == 0 ){
			
			if(this.state instanceof NumberState ||this.state instanceof StartState || this.state instanceof OperationState || this.state instanceof OpenParen){
				this.state = new DecimalState();
			}else{
				this.state = new ErrorState();
			}
			
		}else if (c.compareTo(" ")==0){
			
		}else if(c.compareTo("=")==0){
			
			if(this.state instanceof NumberState || this.state instanceof CloseParen || this.state instanceof AfterDecimal){
				this.state = new ResultState();
			}else{
				this.state=new ErrorState();
			}
			
		}else{
			if(!(this.state instanceof ErrorState)){
				this.state = new ErrorState();
			}
		}
	}
	
	public State getState(){
		return this.state;
	}

	@Override
	public void doAction(CalcContext context, String input) {
		this.state.doAction(context, input);
		
	}
	
	

}
