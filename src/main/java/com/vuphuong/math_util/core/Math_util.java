/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vuphuong.math_util.core;

/**
 *
 * @author Admin
 */
public class Math_util {
    
    public static int getFa(int n){
        if (n == 0 || n == 1)
            return 1;
        return n * getFa(n - 1);
    } 
}
