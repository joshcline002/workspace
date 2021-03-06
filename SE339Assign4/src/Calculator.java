import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			
			CalcContext context = new CalcContext();
			System.out.println("Please input the equation to calculate and then hit enter. Type exit to quit.");
			String s = in.nextLine();
			int i = 0;
			
			if(s.compareTo("exit")==0){
				break;
			}
			
			while(i<s.length()){
				
				if(s.substring(i, i+1).compareTo(" ")!=0){
					context.setState(s.substring(i, i+1));
					context.doAction(context, s.substring(i, i+1));
				}
				
				i++;
			}
				context.setState("=");
				context.doAction(context, "=");
		}
		in.close();
	}

}
