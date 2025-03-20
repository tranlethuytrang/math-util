/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nepgao.mathutil.test.core;

//import org.junit.jupiter.api.AfterEach;

import com.nepgao.core.mathutil;
import org.junit.Assert;
import org.junit.Test;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author THUY TRANG
 */
public class NewEmptyJUnitTest {
    
   //đây là class sẽ sử dụng các hàm của thư viện/framwork Junit để kierm tra/kiểm thử code chính
    //hàm tính giai thừa
    //class core.Mathutil
    //viết code để test
    
    // có rất nhiều quy tắt đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử thành công và thất bại
    // ta sẽ xài hàm kiểu well 5! 6!
    // @test JUnit sẽ phối hợp với JVM để chạy hàm
    //@ test phía hậu trường chính là public static void main()
    // có nhiều @ test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa.
    @Test
    public void testGetFactorialGivenRightArgrumentReturnsWell(){
        int n=0; // test thử tình huống đầu vào
        long exptected =1;
        long actual= mathutil.getfactorial(n);// gọi hàm cần test trong core/app/code chính
        // so sánh expected và actual dùng framework
        Assert.assertEquals(exptected, actual);// hàm giúp so sánh 2 giá trị nào đó có giống nhau không?
                            // nếu giống nhau thì hiên thị màu xanh lá,code ok ít nhất cho case này
                            // nếu không giống nhau thì expeted và actual thì màu đỏ.
    //**gộp thêm vài case thành công với nhau**
    Assert.assertEquals(1, mathutil.getfactorial(1));
    Assert.assertEquals(2, mathutil.getfactorial(2));
    Assert.assertEquals(6, mathutil.getfactorial(3));
    Assert.assertEquals(24, mathutil.getfactorial(4));
    Assert.assertEquals(120, mathutil.getfactorial(5));
    Assert.assertEquals(720, mathutil.getfactorial(6));
    }
    // tình huống đưa data đúng từ 0-20-> done
    //2. đưa data không đúng đưa số âm, hoặc lớn hơn 20; thiết kế của hàm ra ngoại lệ
    //tao kỳ vọng ngoại lệ xuất hiện khi n<0|| n>20
    // actual Ngoại lệ xuất hiện
    // nếu hàm nhận vào n>0 hoặc n>20 thì hàm đúng theo thiết kế.
    // Nếu hàm nhận vào n<0 và n>20 và hàm phải hiển thị ngoài lệ=> màu xanh
    //test case: input-5, exected: IllegalAgrumentException xuất hiện
    //những tình huống ngoại lệ ngoài dự tính không thể đo lường so sánh theo kiểu value 
    //mà chi có thể đo lường bằng cách chúng có xuất hiện hay không?
    //asserEqual() là có bằng nhau hay không về value vì vậy không thể dùng hàm này
//    @Test(expected=NumberFormatException.class)
//    public void testGetFactorialGivenWrongtArgrumentThrowsException(){
//        mathutil.getfactorial(-5);// câu lệnh này có nghĩa là getfactorial chạy sẽ trả về ngoại lệ
//    }
     @Test(expected=IllegalArgumentException.class)
    public void testGetFactorialGivenWrongtArgrumentThrowsException(){
        mathutil.getfactorial(-5);// câu lệnh này có nghĩa là getfactorial chạy sẽ trả về ngoại lệ
    }
// cách khác để bắt ngoại lệ xuất hiện một cách tự nhiên hơn
    
// Lambda expection
// test case: hàm sẽ trả về ngoại lệ nếu nhận vào 21
     @Test
    public void testGetFactorialGivenWrongtArgrumentThrowsException_LambdaVersion(){
//         Assert.assertThrows(tham số 1: Loại goại lệ muốn so sánh, 
//                 Tham số 2: đoạn code để tra ra ngoại lệ đó)
           Assert.assertThrows(IllegalArgumentException.class,
                    () -> mathutil.getfactorial(-5));
       //mathutil.getfactorial(-5);// câu lệnh này có nghĩa là getfactorial chạy sẽ trả về ngoại lệ
    }
    // Lambda expection
// test case: hàm sẽ trả về ngoại lệ nếu nhận vào 21
     @Test
    public void testGetFactorialGivenWrongtArgrumentThrowsException_TryCatch(){
        //chủ động kiểm soát ngoại lệ 
        try {
            mathutil.getfactorial(-5);// câu lệnh này có nghĩa là getfactorial chạy sẽ trả về ngoại lệ

         } catch (Exception e) {
             //bằng cách trycatch là junit sẽ hiển thị màu xanh nhưng
             // không chắc có ngoại lệ xuất hiện hay k?
             // vì vậy phải có đoạn code kiểm soát đúng ngoại lệ illegargument xảy ra hay k?
            Assert.assertEquals("invaild argument n must betwen 0-20",e.getMessage());
             //e.getmesssage là ngoại lệ trả về, trong đó có tất cả full thông tin mô tả về ngoại lệ, có câu báo lỗi về data input
         }
    }
}
