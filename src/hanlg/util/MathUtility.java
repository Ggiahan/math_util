/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanlg.util;

/**
 *
 * @author DELL
 */
public class MathUtility {

    // lam bi thu vien fake y chang math
    //Math.PI, abc() .sqrt() .pow(a,b) a^b
    // pham la thu vien thi se xai static khi ko can luu info cho rieng minh
    //con thu vien ma van can luu info rieng, thi van non-static nhu bth
    public static final double PI = 3.1415;

    // tien ich tin gia thua n!= 1.2.3.4.5.
    //n phair laf ti 0 tro len 
    //0!= 1!=1
    //am giai thua vo nghia
    //giai thua tang cuc nhanh, 21! long khong chua dc
    //bai nay minh se chan giai thua tu 0-20
    //am hoac 21 cui o them tinh
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0...20");
        }
        if (n == 0 || n == 1) {
            return 1;//truong hop dac biet
        }
        // dua nao viet else tru diem
        //mac nhien cpu den dc day la hieu rang n=2..20

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

    }

}
