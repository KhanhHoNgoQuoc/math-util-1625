/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khanh.mathutil.test.core;

import com.khanh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
 @Test
   public void testGetFactorialGivenRightArgumentReturnsWell(){
       int n=0;//test thu tinh huong tu te dau vao
       long expected =1;
      // long actual=  // goi ham can test//app chinh/code chinh
      long actual =MathUtility.getFactorial(n);
      // so sánh dùng framework
      Assert.assertEquals(expected, actual);// ham so sanh 2 gia tri
      //gộp thêm vài case thành công /đưa đầu vào ngon hàm ngon 
       Assert.assertEquals(1, MathUtility.getFactorial(1));
       Assert.assertEquals(2, MathUtility.getFactorial(2));
       Assert.assertEquals(720, MathUtility.getFactorial(6));
      
       
   }
   // hàm getF() ta thiêt kế 2 tình huống xử lý
//1 đưa data tử tế trong [0..20]-> tính đúng đc n!
//2. đưa data vào ko đúng, âm,>20; thiết kế của hàm ném ra ngoại lệ
// tao kì vọng ngoại lê khi n<0 || n>20
// rất mong ngoại lệ xuất hiện với n cà chớn
// nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
// hàm chạy đúng thiết kế --> xanh phải xuất hiện
// nếu hàm nhận vào n <0 hoặc n > 20 và hàm ném ra ngoại lệ
// hàm chạy đúng thiết kế --> xanh xuất hiện
//nếu hàm nhận vào n <0 hoặc n > 20 và hàm éo ném ra ngoại lệ
//sure, hàm chạy sai thiết kế, sai kì vọng , màu đó
//Test case
// input:-5
//expected :IllegalArgumentException xuất hiện
// tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu 
// là những thứ ko thể đo lường so sánh theo kiểu value
// mà chỉ có thể đo lương = cách chúng có xuất hiện hay ko
//assertEquals() ko dùng để so sánh 2 ngoại lệ
// equals() là bằng nhau hay ko trên value
   
   //màu đỏ đó em, do hàm đúng là có ném ngoại lệ,thật sự
//nhưng ko phải là ngoại lệ như kì vọng,thực sự kỳ vọng
//ko phải hàm ném sai
// @Test(expected =NumberFormatException.class)
// public void testGetFactorialGivenWrongArgumentThrowsException(){
//     MathUtility.getFactorial(-5);//hàm @Test chạy , hay hàm getF() chạy
//                                        // sẽ ném về ngoại lệ NumberFormat
// }
 
// @Test(expected =IllegalArgumentException.class)
// public void testGetFactorialGivenWrongArgumentThrowsException(){
//     MathUtility.getFactorial(-5);//hàm @Test chạy , hay hàm getF() chạy
//                                        // sẽ ném về ngoại lệ NumberFormat
// }
 //cách khác để bắt ngoại lệ , viết tự nhiên hơn
 @Test
 public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
     //Assert.assertThrows(tham sô' 1: loai ngoai le muon so sanh, doan code chay vang ra ngoai le do)
     Assert.assertThrows(IllegalArgumentException.class,()-> MathUtility.getFactorial(-5));
     //MathUtility.getFactorial(-5);//hàm @Test chạy , hay hàm getF() chạy
                                        // sẽ ném về ngoại lệ NumberFormat
 }
 @Test
 public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
     //chu dong kiem soat ngoai le
     try {
          MathUtility.getFactorial(-5);
     } catch (Exception e) {
         Assert.assertEquals("Invalid argument.N must be between 0..20",e.getMessage());
     }
    
//bắt try catch junit sẽ ra xanh do junit đã chủ động kiểm soát ngoại lệ
//nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không
//có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException
  
 }
}
