/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanh.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
//      public static long getFactorial(int n)
//    {
//        if (n<0||n>20)
//            throw new IllegalArgumentException("Invalid argument.N must be between 0..20");
//        if(n==0||n==1)
//            return 1;
//        long product=1;
//        for (int i = 2; i <=n; i++) 
//            product=product *i;
//             return product;
//        
//    }
      public static long getFactorial(int n)
    {
       if (n<0||n>20)
          throw new IllegalArgumentException("Invalid argument.N must be between 0..20");
        if(n==0||n==1)
            return 1;
        return n*getFactorial(n-1 );
        
    }
      
//học đệ quy 
// Hiện tượng gọi lại chính mình với 1 quy mô khác
}
