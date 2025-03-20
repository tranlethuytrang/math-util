/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nepgao.main;

import com.nepgao.core.mathutil;

/**
 *
 * @author THUY TRANG
 */
public class main {
    public static void main(String[] args) {
         // thử nghieemh hàm tính giai thừa coi chạy đúng như thiết kế hay không
        // ta phả đưa ra các tình huống sử dụng hàm trong thực tế.
        // vd: -5 coi tính được hông, 0 coi tính mấy, 20,21 tính ra bn
        //test case: là một tình huống hàm/app/màn hình tnhs năng đưa vào sử dụng giả lập hành vi của người dùng.
        // input: data đầu vào cụ thể nào đó.
        // output: đầu ra ứng với xử lý của hàm, chức nawg của app và phải dùng đầu vào đã đưa ra trước đó để xử lý.
        // kỳ vong: mong hàm sẽ trả về value nào đó với input
        // so sánh để xem kết quả có như kỳ vọng hay không.
        long expected=120;
        int n=5; //input
        long actual= mathutil.getfactorial(n);
                System.out.println("5!="+expected+" expected");
                System.out.println("5!="+actual+" expected");
    }
}
