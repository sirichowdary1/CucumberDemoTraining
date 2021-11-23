package simpleDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setUp() throws Exception
	{
		cal=new Calculator();
	}
	
	
	@After
	public void tearDown()
	{
		cal=null;
	}
	
	@Test
	
	public void testAddTwoNumbers()
	{
		assertEquals(12,cal.addTwoNumbers(6,6));
		
		System.out.println("Hello Addition");
	}
	
	@Test
	
	public void testSubTwoNumbers()
	{
		assertEquals(12,cal.subTwoNumbers(12,0));
		System.out.println("Hello Subtraction");
	}

}
