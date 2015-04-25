import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test_Run {
	
	public static void main(String args[]){
		  Result result = JUnitCore.runClasses(AccountTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println("Failure : " + failure.toString());
	      }
	      System.out.println("Was Successful : " + result.wasSuccessful());
	}
}