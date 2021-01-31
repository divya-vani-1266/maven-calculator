package calculator;

import org.junit.Assert;
import junit.framework.TestCase;


public class AppTest extends TestCase {

	Calculator cal = new Calculator();
    
    public void testAdd() {
        Assert.assertEquals(cal.add(15, 25), 40);
    }
    public void testSubtaction() {
        Assert.assertEquals(cal.sub(12, 2), 10);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.mul(3, 6), 18);
    }
    
}

