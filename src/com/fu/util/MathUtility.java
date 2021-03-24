/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.util;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MathUtility {
    // Create function same like Math class of JDK
    // Use it for all
    // Use static
    public static final double PI = 3.1415;
    public static long getFactorial(int n) {
    long factorial = 0;
        if (n<0 || n>20){
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
    
    }

