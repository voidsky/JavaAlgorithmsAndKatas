/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author namai
 */
public class PrimeFactorTest {

    @Test
    public void PrimeFactorOf1ReturnsEmpty() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = PrimeFactor.Generate(1);
        assertEquals(result, expected); 
    }
    
    @Test
    public void PrimeFactorOf2Returns2() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result = PrimeFactor.Generate(2);
        assertEquals(result, expected); 
    }

    @Test
    public void PrimeFactorOf3Returns3() {
        List<Integer> expected = Arrays.asList(3);
        List<Integer> result = PrimeFactor.Generate(3);
        assertEquals(result, expected); 
    }
    
    @Test
    public void PrimeFactorOf4Returns22() {
        List<Integer> expected = Arrays.asList(2,2);
        List<Integer> result = PrimeFactor.Generate(4);
        assertEquals(result, expected); 
    }
    
    @Test
    public void PrimeFactorOf6Returns23() {
        List<Integer> expected = Arrays.asList(2,3);
        List<Integer> result = PrimeFactor.Generate(6);
        assertEquals(result, expected); 
    }    
    
        
    @Test
    public void PrimeFactorOf8Returns222() {
        List<Integer> expected = Arrays.asList(2,2,2);
        List<Integer> result = PrimeFactor.Generate(8);
        assertEquals(result, expected); 
    }

    
    @Test
    public void PrimeFactorOf9Returns33() {
        List<Integer> expected = Arrays.asList(3,3);
        List<Integer> result = PrimeFactor.Generate(9);
        assertEquals(result, expected); 
    }        
    
        
    @Test
    public void PrimeFactorOf10Returns25() {
        List<Integer> expected = Arrays.asList(2,5);
        List<Integer> result = PrimeFactor.Generate(10);
        assertEquals(result, expected); 
    }    
    
    
}
