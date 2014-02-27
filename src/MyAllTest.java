import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class MyAllTest extends TestCase{
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(MyTestCase1.class);
		suite.addTestSuite(MyTestCase2.class);
		suite.addTestSuite(MyTestCase3.class);
		return suite;
	}
}
