import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class test_run {
	
	public static void main(String args[]){
		  Result result = JUnitCore.runClasses(assign1.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println("Failure : " + failure.toString());
	      }
	      System.out.println("Was Successful : " + result.wasSuccessful());
	}
}
