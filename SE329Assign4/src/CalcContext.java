import java.util.Stack;


public class CalcContext implements State{
	
	private State state = new StartState();
	public Stack<String> operation = new Stack<String>();
	public Stack<Integer> numbers = new Stack<Integer>();
	public String num = "";
	
	public CalcContext(){
		state = null;
	}
	
	public void setState(String c){
		
		int digit = -1;
	try{	
		digit = Integer.parseInt(c);
	}catch(Exception e){
		
	}
		if(c.compareTo("-") == 0 || c.compareTo("+") == 0){
			
			if(this.state instanceof NumberState){
				this.state = new OperationState();
			}else{
				this.state = new ErrorState();
			}
			
		}else if(digit < 10 && digit >= 0 ){
			
			if(this.state instanceof StartState || this.state instanceof NumberState || this.state instanceof OperationState){
				this.state = new NumberState();
			}else{
				this.state = new ErrorState();
			}
			
		}else if (c.compareTo(" ")==0){
			
		}else if(c.compareTo("=")==0){
			
			if(this.state instanceof NumberState){
				this.state = new ResultState();
			}else{
				this.state=new ErrorState();
			}
			
		}else{
			
			this.state = new ErrorState();
			
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