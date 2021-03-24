/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.test;

import com.fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class MathUtilityTest {
   @Test // biến hàm này thành main().  
   public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5;
       long expected = 120;
       long actual = MathUtility.getFactorial(n);
       assertEquals(expected, actual);
   }
    
}
