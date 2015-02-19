import static org.junit.Assert.*;

import org.junit.Test;


public class Assign2 {
	
	Object O1 = new Object();
	Object O2 = new Object();
	Object O3 = new Object();
	Object O4 = new Object();
	Object O5 = new Object();
	
	
	@Test
	public void testStartEmpty() {
		QueueFaulty Q = new QueueFaulty();
		assertTrue(Q.isEmpty());
	}
	
	@Test
	public void testNotFull(){
		QueueFaulty Q = new QueueFaulty();
		assertFalse(Q.isFull());
	}
	
	@Test
	public void testEnqueue(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		assertFalse(Q.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		QueueFaulty Q = new QueueFaulty();
		O1 = "5";
		Q.enqueue(O1);
		Object I = Q.dequeue();
		assertSame(I, O1);
	}
	
	@Test
	public void testDefMax(){
		QueueFaulty Q1 = new QueueFaulty();
		Q1.enqueue(O1);
		Q1.enqueue(O2);
		assertTrue(Q1.isFull());
	}
	
	@Test
	public void testDeqEmpty(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		assertFalse(Q.isEmpty());
		Q.dequeue();
		assertTrue(Q.isEmpty());
	}
	
	@Test
	public void testSet(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(3);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		assertTrue(Q.isFull());
	}
	
	@Test
	public void testSetMax(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(25);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.enqueue(O4);
		Q.enqueue(O5);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.enqueue(O4);
		Q.enqueue(O5);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.enqueue(O4);
		Q.enqueue(O5);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.enqueue(O4);
		Q.enqueue(O5);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.enqueue(O4);
		Q.enqueue(O5);
		assertTrue(Q.isFull());
	}
	
	@Test
	public void testSetOverMax(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(26);
		Q.enqueue(O1);
		Q.enqueue(O2);
		assertTrue(Q.isFull());
	}
	
	@Test
	public void testCap(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		Q.setCapacity(26);
		Q.enqueue(O2);
		assertFalse(Q.isFull());
	}
	
	@Test
	public void testCap1(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(3);
		assertTrue(Q.isEmpty());
	}
	
	@Test(expected=java.lang.IllegalStateException.class )
	public void testUnderQueue(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(2);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.setCapacity(1);
		assertTrue(Q.isFull());
		Q.dequeue();
		assertFalse(Q.isFull());
		assertFalse(Q.isEmpty());
		Q.dequeue();
		assertTrue(Q.isEmpty());
		Q.dequeue();
	}
	
	@Test
	public void testMaxNotEmpty(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		Q.enqueue(O2);
		assertFalse(Q.isEmpty());
	}
	
	@Test(expected=java.lang.IllegalStateException.class )
	public void testPassedCapacity(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
	}
	
	@Test(expected=java.lang.IllegalStateException.class )
	public void testPullEmpty(){
		QueueFaulty Q = new QueueFaulty();
		Q.dequeue();
	}
	
	@Test(expected=java.lang.NullPointerException.class )
	public void testPutEmpty(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(null);
	}
	
	//Covers paths {1,2,3},{2,3,4},{3,4,2},{4,2,3},{3,2,5},{2,5,6} for edge coverage.
	//Covers Paths {1,2,3,4},{2,3,4,2},{3,4,2,3}, {4,2,3,4}, {2,3,2},{3,2,5,6} for prime coverage.
	@Test
	public void string2ObjTest(){
		QueueFaulty Q = new QueueFaulty();
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		String test = "[" + O1.toString() + ", " + O2.toString() + ", " + O3.toString() + "]";
		assertEquals(Q.toString(), test);
	}
	
	//Covers paths {1,2,5}, {2,5,6} for edge coverage.
	//Covers paths {1,2,5,6} for prime paths.
	@Test
	public void stringNullTest(){
		QueueFaulty Q = new QueueFaulty();
		String test = "[]";
		assertEquals(Q.toString(), test);
	}
	
	
	@Test
	public void testCapChange(){
		QueueFaulty Q = new QueueFaulty();
		Q.setCapacity(3);
		Q.enqueue(O1);
		Q.enqueue(O2);
		Q.enqueue(O3);
		Q.setCapacity(1);
		Q.dequeue();
		assertFalse(Q.isEmpty());
		Q.setCapacity(2);
		assertTrue(Q.isFull());
		Q.setCapacity(3);
		assertFalse(Q.isFull());
	}
	
	

}
