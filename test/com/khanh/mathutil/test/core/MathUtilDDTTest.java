/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.khanh.mathutil.test.core;

import com.khanh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

//câu lệnh của Junit báo hiệu rằng loop qua tập data
//để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value=Parameterized.class)
public class MathUtilDDTTest {
    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected/Input
    @Parameterized.Parameters
    //Junit sẽ ngầm chạy loop qua từng dòng của mảng
// để lấy ra đc cặp data input/expected
//tên hàm ko quan trọng , quan trọng là @
//giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột
//vào biến tương ứng input/expected để lát ta feed cho hàm 
    public static Object[][] initData(){
        return new Integer[][]{
                            {0,1},
                            {1,1},
                            {2,2},
                            {3,6},
                             {4,24},
                             {6,720},
        };
    }
    @Parameterized.Parameter(value = 0) //value=0 là map với mảng data
    public int n; //biến map với value cột 0 của mảng 
     @Parameterized.Parameter(value = 1)
    public long expected;//kiểu long vì giá trị trả về hàm getF() là long 
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
