/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vuphuong.math_util.test;

import com.vuphuong.math_util.core.Math_util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
    
    @Test
    public void testFa(){
        assertEquals(6, Math_util.getFa(3));
        assertEquals(24, Math_util.getFa(4));
        assertEquals(120, Math_util.getFa(5));
      
    }
}
