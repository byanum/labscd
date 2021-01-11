/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anum
 */
public class DiscountRateTest {
    
    public DiscountRateTest() {
    }
    
 /*   @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
*/
    /**
     * Test of rate method, of class DiscountRate.
     */
    @Test
    public void testRate() {
        System.out.println("passed");
        double price = 0.25;
        int per = 100;
        DiscountRate instance = new DiscountRate();
        double expResult = 25.0;
        double result = instance.rate(price, per);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
