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
import myutils.MyUtils;
import static org.junit.Assert.*;


/**
 *
 * @author IES
 */

public class TestInverteix {

    public TestInverteix() {
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
    public void TestInverteix() {
        String input = "Hola";
        String expected = "aloH";
        assertEquals(expected, MyUtils.inverteix(input));
    }

    @Test
    public void TestInverteix1() {
        String input = null;
        String expected = null;
        assertEquals(expected, MyUtils.inverteix(input));
    }

    @Test
    public void TestInverteix2() {
        String input = "";
        String expected = "";
        assertEquals(expected, MyUtils.inverteix(input));
    }
}
