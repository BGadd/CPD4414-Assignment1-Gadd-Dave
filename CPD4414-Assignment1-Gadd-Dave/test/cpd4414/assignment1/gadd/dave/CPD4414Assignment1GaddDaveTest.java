/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.gadd.dave;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0641903
 */
public class CPD4414Assignment1GaddDaveTest {
    
    public CPD4414Assignment1GaddDaveTest() {
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

    /**
     * Test of main method, of class CPD4414Assignment1GaddDave.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CPD4414Assignment1GaddDave.main(args);
    }

    /**
     * Test of stringPower method, of class CPD4414Assignment1GaddDave.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("testEmptyStringShouldReturnEmptyString");
        String s = "";
        int i = 1;
        CPD4414Assignment1GaddDave instance = new CPD4414Assignment1GaddDave();
        String expResult = "";
        String result = instance.stringPower(s, i);
        assertEquals(expResult, result);
    }
    @Test
    public void testLessThanOneShouldReturnNull(){
        System.out.println("testLessThanOneShouldReturnNull");
        String s = "";
        int i = 0;
        CPD4414Assignment1GaddDave instance = new CPD4414Assignment1GaddDave();
        String expResult = null;
        String result = instance.stringPower(s, i);
        assertEquals(expResult, result);
    }
    @Test
    public void testStringAndOneShouldReturnString(){
        System.out.println("testStringAndOneShouldReturnString");
        String s = "Sample String";
        int i = 1;
        String expResult = "Sample String";
        CPD4414Assignment1GaddDave instance = new CPD4414Assignment1GaddDave();
        String result = instance.stringPower(s, i);
        assertEquals(expResult, result);
    }
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String s = "bob";
        int i = 2;
        String expResult = "bobbob";
        CPD4414Assignment1GaddDave instance = new CPD4414Assignment1GaddDave();
        String result = instance.stringPower(s, i);
        assertEquals(expResult, result);
    }
}
