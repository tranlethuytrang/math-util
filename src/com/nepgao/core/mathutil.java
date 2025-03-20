/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nepgao.core;

/**
 *
 * @author THUY TRANG
 */
public class mathutil {
    //trong class này cung cấp cho ai đó hàm cần xử lý toán học
    // clone class math của jdk
    //hàm thư viện xài chung, không cần lưu lại trạng thía/ giá trị
    //chọn thiết kế là hàm static
    
    //tính hàm giai thừa
    // quy ước: n!-1x2x3x4x5...., không có giai thừa số âm
    //0!= 1!=1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tnawg nhanh về giá trị
    //20 giai thừa 18 con số 0 vưa fhopwj kieru long, 21 giai thừa tran kiểu long
    public static long getfactorial (int n) {
            
    if (n<0||n>20)
        throw new IllegalArgumentException("invaild argument n must betwen 0-20");
    if (n==0||n==1)
        return 1;
    long product=1;
        for (int i = 2; i <= n; i++) 
            product *=i;
        return product;

}
}
