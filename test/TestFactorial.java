/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import myutils.MyUtils;

/**
 *
 * @author Roger G. Coscojuela
 */
public class TestFactorial {

    public TestFactorial() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestFactorial() {
        long input = 0;
        long expected = 1;
        assertEquals(expected, MyUtils.factorial(input));
    }
       @Test
    public void TestFactorial2() {
        long input = 20;
        long expected =2432902008176640000L;
        assertEquals(expected, MyUtils.factorial(input));
    }
    
           @Test
    public void TestFactorial3() {
        long input = -1;
        long expected =-1;
        assertEquals(expected, MyUtils.factorial(input));
    }
               @Test
    public void TestFactorial4() {
        long input = 22;
        long expected =-1;
        assertEquals(expected, MyUtils.factorial(input));
    }
}
