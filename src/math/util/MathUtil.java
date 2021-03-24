/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import com.fu.util.MathUtility;

/**
 *
 * @author Acer
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello github");
        System.out.println("This is 1st upload that connects to remote server: Github");
        
        // 5 giai thua co = 120 hay k
        int n = 5;
        long expected = 120; // hy vong ham tinh ra 120
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! expected: " + expected
                           +"; actual " + actual);
        
    }
    
}
