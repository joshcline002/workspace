import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AccountTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
	private PrintStream stdout;
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Before
	public void setUpStreams() {
		stdout = System.out;
	    System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void test_construct_0_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(0, "Josh", 1);
	}
	
	@Test
	public void test_construct_neg_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(-20, "Josh", 1);
	}
	
	@Test
	public void test_withdraw_0_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(1, "Josh", 1);
		act.withdraw(0);
	}
	
	@Test
	public void test_withdraw_neg_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(1, "Josh", 1);
		act.withdraw(-5);
	}
	
	@Test
	public void test_over_withdraw_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Insufficient Fund");
		Account act = new Account(1, "Josh", 1);
		act.withdraw(2);
	}
	
	@Test
	public void test_deposit_0_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(1, "Josh", 1);
		act.deposit(0);
	}
	
	@Test
	public void test_deposit_neg_exception() throws Throwable {
		expectedEx.expect(Exception.class);
	    expectedEx.expectMessage("Invalid amount");
		Account act = new Account(1, "Josh", 1);
		act.deposit(-5);
	}
	
	@Test
	public void test_account_balance() throws Exception {
		Account act = new Account(5, "Josh", 1);
		assertTrue(5 == act.getBalance());
	}
	
	@Test
	public void test_account_number() throws Exception{
		Account act = new Account(5, "Josh", 1);
		assertTrue(1 == act.getAcctNumber());
	}
	
	@Test
	public void test_account_toString() throws Exception{
		Account act = new Account(5, "Josh", 1);
		String test = "Name: Josh\nAccount Number: 1\nBalance: 5.0";
		assertEquals(act.toString(), test);
	}
	
	@Test
	public void test_withdraw_greater() throws Throwable {
		Account act = new Account(5, "Josh", 1);
		act.withdraw(4);
		assertTrue(1 == act.getBalance());
	}
	
	//Test to fix mutations
	@Test
	public void test_withdraw_equal() throws Throwable{
		Account act = new Account(5, "Josh", 1);
		act.withdraw(5);
		assertTrue(0 == act.getBalance());
	}
	
	@Test
	public void test_deposit() throws Throwable {
		Account act = new Account(1, "Josh", 1);
		act.deposit(4);
		assertTrue(5 == act.getBalance());
	}
	
	@Test
	public void test_change_accountNum() throws Throwable {
		Account act = new Account(1, "Josh", 1);
		act.ChangeAccountNumber(2);
		assertTrue(2 == act.getAcctNumber());
	}
	
	@Test
	public void test_change_name() throws Throwable{
		Account act = new Account(5, "Josh", 1);
		act.ChangeAccountName("Bob");
		String test = "Name: Bob\nAccount Number: 1\nBalance: 5.0";
		assertEquals(act.toString(), test);
	}
	
	@Test
	public void test_account_closed() throws Throwable{
		Account act = new Account(5, "Josh", 1);
		act.close();
		String test = "Name: JoshCLOSED\nAccount Number: 1\nBalance: 0.0";
		assertEquals(act.toString(), test);
	}
	
	@Test
	public void test_account_consolidate_sameNum() throws Throwable{
		Account act3 = new Account(5, "Josh", 1);
		Account act4 = new Account(10, "Josh", 1);
		Account act5 = Account.Accountconsolidate(act3, act4);
		assertTrue(act5 == null);
	}
	
	@Test
	public void test_account_consolidate_diffName() throws Throwable{
		Account act1 = new Account(5, "Josh", 1);
		Account act2 = new Account(10, "Bob", 2);
		assertTrue(Account.Accountconsolidate(act1, act2) == null);
	}
	
	@Test
	public void test_account_consolidate() throws Throwable{
		Account act1 = new Account(5, "Bill", 1);
		Account act2 = new Account(10, "Bill", 2);
		String test = "Name: Bill\nAccount Number: 27\nBalance: 15.0";
		assertEquals(Account.Accountconsolidate(act1, act2).toString(), test);
	}
	
	@Test
	public void test_Numaccount() throws Throwable{
		Account.numAccounts=0;
		Account act1 = new Account(5, "Bill", 1);
		Account act2 = new Account(10, "Bill", 2);
		assertTrue(Account.getNumAccounts()==2);
	}
	
	@Test
	public void test_Numaccount_close() throws Throwable{
		Account.numAccounts=0;
		Account act1 = new Account(5, "Bill", 1);
		Account act2 = new Account(10, "Bill", 2);
		act2.close();
		assertTrue(Account.getNumAccounts()==1);
	}
	
	@Test
	public void test_account_consolidate_sameNum_Message() throws Throwable{
		outContent.reset();
		Account act3 = new Account(5, "Josh", 1);
		Account act4 = new Account(10, "Josh", 1);
		Account act5 = Account.Accountconsolidate(act3, act4);
		String test = "Same account numbers cannot be consolidated.\n";
		assertEquals(test.toString(), outContent.toString() );
	}
	
	@Test
	public void test_account_consolidate_diffName_Message() throws Throwable{
		outContent.reset();
		Account act3 = new Account(5, "Bill", 2);
		Account act4 = new Account(10, "Josh", 1);
		Account act5 = Account.Accountconsolidate(act3, act4);
		String test = "Different account names cannot be consolidated.\n";
		assertEquals(test.toString(), outContent.toString());
	}
	
	@Test
	public void test_consolidate_closeOne() throws Throwable{
		Account.numAccounts=0;
		Account act1 = new Account(5, "Bill", 1);
		Account act2 = new Account(10, "Bill", 2);
		Account act5 = Account.Accountconsolidate(act1, act2);
		String test = "Name: BillCLOSED\nAccount Number: 1\nBalance: 0.0";
		assertEquals(act1.toString(), test);
	}
	
	@Test
	public void test_consolidate_closeTwo() throws Throwable{
		Account.numAccounts=0;
		Account act1 = new Account(5, "Bill", 1);
		Account act2 = new Account(10, "Bill", 2);
		Account act5 = Account.Accountconsolidate(act1, act2);
		String test = "Name: BillCLOSED\nAccount Number: 2\nBalance: 0.0";
		assertEquals(act2.toString(), test);
	}
	
	@Test
	public void test_Main() throws Exception{
		Account.numAccounts = 0;
		outContent.reset();
		String [] args = new String[1];
		System.setIn(in);
		String test = "How many accounts would you like to create?\n";
		test = test + "\nCreated account Name: Name-1";
		test = test + "\nAccount Number: 1\nBalance: 100.0";
		test = test + "\nNow there are 1 accounts";
		test = test + "\nCreated account Name: Name-2";
		test = test + "\nAccount Number: 2\nBalance: 100.0";
		test = test + "\nNow there are 2 accounts";
		Account.main(args);
		assertEquals(test, outContent.toString());
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(stdout);;
	}
	
	
	
	
	
	
	
	
	
	
}
