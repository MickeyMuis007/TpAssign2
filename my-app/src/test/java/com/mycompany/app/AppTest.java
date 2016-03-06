package com.mycompany.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void test1()
    {
        assertTrue( true );
    }
    public void testFloat() throws Exception
    {
        MavernTest obj = new MavernTest();
        obj.setBalance(1.5f);
        Assert.assertEquals(1.5f, obj.getBalance(), 0.007);
    }
    public void testInt() throws Exception
    {
        MavernTest obj = new MavernTest();
        obj.setAge(1);
        Assert.assertEquals(1, obj.getAge());
    }
    public void testObj() throws Exception
    {
        MavernTest obj = new MavernTest();
        MavernTest obj1 = new MavernTest();
        Assert.assertSame(obj, obj.getObject());
    }
    public void testTrue() throws Exception
    {
        MavernTest obj = new MavernTest();
        obj.setCat(true);
        Assert.assertTrue(obj.hasCat());
    }
    public void testFalse() throws Exception
    {
        MavernTest obj = new MavernTest();
        obj.setDog(false);
        Assert.assertFalse(obj.hasDog());
    }
    public void testNull() throws Exception
    {
        MavernTest obj = new MavernTest();
        obj = null;
        Assert.assertNull(obj);
    }
    public void testNotNull() throws Exception{
        MavernTest obj = new MavernTest();
        Assert.assertNotNull(obj);
    }
    public void testNotSame() throws Exception{
        MavernTest obj = new MavernTest();
        MavernTest obj1 = new MavernTest();
        Assert.assertNotSame(obj,obj1);
    }
}
