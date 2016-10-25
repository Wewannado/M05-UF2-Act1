/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Roger G. Coscojuela
 */

@RunWith(Parameterized.class)
public class TestEdad {

    private int expected;
    private int dia;
    private int mes;
    private int any;

    public TestEdad(int expected, int dia, int mes, int any) {
        this.expected = expected;
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    @Parameters
    public static List<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {-2, 32, 12, 2016}, //{expected, dia, mes any}
            {-2, 31, 12, 2500},
            {-1, 31, 12, 1500}
        });
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

    @Test
    public void TestEdadDatesImposibles() {
        assertEquals(expected, MyUtils.edat(dia, mes, any));
    }

    @Test
    public void TestEdad() {
        assertEquals(28, MyUtils.edat(31, 01, 1988));
    }
}
