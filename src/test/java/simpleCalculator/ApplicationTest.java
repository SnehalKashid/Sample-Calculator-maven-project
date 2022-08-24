package simpleCalculator;

import junit.framework.Assert;
import junit.framework.TestCase;
import simpleCalculator.Calculator;

public class ApplicationTest extends TestCase {
    Calculator cal = new Calculator();

   public void testAdd() {
        Assert.assertEquals(cal.add(10, 20), 30);
    }
    public void testSub() {
        Assert.assertEquals(cal.sub(105,55), 50);
    }
    public void testDiv() {
        Assert.assertEquals(cal.div(10, 5), 2.0);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.mul(8,5), 40);
}