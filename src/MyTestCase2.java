
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;


public class MyTestCase2 extends TestCase{
	
	/*
	 * follow the extends relations
	 */
	
	Calculator calculator = new Calculator();
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Override
	public TestResult run() {
		return super.run();
	}
	
	public void testAdd() {
		calculator.add(4);
		calculator.substract(2);
		assertEquals(2, calculator.getResult());
	}
	
}
