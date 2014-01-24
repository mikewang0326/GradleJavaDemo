
import junit.framework.TestCase;
import junit.framework.TestResult;


public class MyTestCase3 extends TestCase{
	
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
		calculator.add(9);
		calculator.divide(3);
		assertEquals(9, calculator.getResult());
	}
	
}
