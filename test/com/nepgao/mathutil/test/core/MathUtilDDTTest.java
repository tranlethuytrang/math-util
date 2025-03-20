/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nepgao.mathutil.test.core;

import com.nepgao.core.mathutil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author THUY TRANG
 */
@RunWith(value = Parameterized.class)// câu lệnh này chỉ có ở Junit báo hiệu rằng sẽ cần loop qua data để lấy các cặp data inut/expected để đưa vào hàm test
public class MathUtilDDTTest {
    // hàm này ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected Input
    @Parameterized.Parameters // sau này thì Junit sẽ ngầm chạy qua từng dogf của mảng để lấy ra được cặp data input/expected
                              // tên hàm không quan rọng, quan trọng là @
    public static Object[][] initData (){
        return new Integer [][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,720},
     };
}
 // giả sử đã loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột  
   //khi báo mảng int a[] -{5,10,15,20}; đây là khai báo mảng 1 chều gán trực tiếp value của cột vào trong biến tương ứng input,expected để lát hồi feed cho hàm test
    @Parameterized.Parameter(value = 0)// value=0 là map với mảng data
    //biến map với valua của cột 0 của mảng
    public int input; 
    // value=0 là map với mảng data
    @Parameterized.Parameter(value = 1)
    public long expected; // vì trả về giá trị về của hàm getf
    @Test
    public void testGetFactorialGivenRightArgrumentReturnsWell(){
        Assert.assertEquals(expected, mathutil.getfactorial(input));
}
    //public void testGetFactorialGivenWrongtArgrumentThrowsException(){}  
}

