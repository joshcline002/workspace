import static org.junit.Assert.*;

import org.junit.Test;


public class triangleTest {
	
	@Test
	public void test_notatriangle() {
		int type = triangle.Triang(4, 7, 3);
		System.out.println(type);
		assertTrue(type == 4);
	}
	@Test
	public void test_equilateral() {
		int type = triangle.Triang(3, 3, 3);
		System.out.println(type);
		assertTrue(type == 3);
	}
	@Test
	public void test_isosceles1() {
		int type = triangle.Triang(3, 4, 3);
		System.out.println(type);
		assertTrue(type == 2);
	}
	
	@Test
	public void test_isosceles2() {
		int type = triangle.Triang(4, 4, 5);
		System.out.println(type);
		assertTrue(type == 2);
	}
	
	@Test
	public void test_scalene() {
		int type = triangle.Triang(5, 4, 3);
		System.out.println(type);
		assertTrue(type == 1);
	}
	
	@Test
	public void test_noTri2(){
		int type = triangle.Triang(4, 1, 1);
		System.out.println(type);
		assertTrue(type == 4);
	}
	
	
}
