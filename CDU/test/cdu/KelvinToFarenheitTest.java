/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANGEL
 */
public class KelvinToFarenheitTest {
   
    @Test
    public void testMethod() {
        System.out.println("method");
        double value = 10;
        KelvinToFarenheit instance = new KelvinToFarenheit();
        double expResult = -441.67;
        double result = instance.method(value);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of menu method, of class KelvinToFarenheit.
     */
    
    
}
