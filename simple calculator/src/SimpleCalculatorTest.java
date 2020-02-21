import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculator test = new SimpleCalculator();
		int x= test.add(5,2);
		assertEquals(7,x);
		//System.out.println("done");
	}
	
	@Test
	public void testAdd2() {
		SimpleCalculator test = new SimpleCalculator();
		int x= test.add(-5,2);
		assertEquals(-3,x);
	}

	@Test
	public void testDivide() {
		SimpleCalculator test = new SimpleCalculator();
		float z= test.divide(50,5);
		assertEquals(10, z, 0);
	}
	
	@Test
	public void testDivide2() {
		SimpleCalculator test = new SimpleCalculator();
		float z= test.divide(50,0);
		assertEquals(0, z, 0);
	}

}
