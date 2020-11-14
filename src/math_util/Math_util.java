/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math_util;

import hanlg.util.MathUtility;

/**
 *
 * @author DELL
 */
public class Math_util {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;// to hi vong 120 neu goi 5!
        long actual = MathUtility.getFactorial(5);
        // in ra de kiem tra su khop nhau giua cai toi muon va cai toi lam
        System.out.println("5! EXPECTED: " + expected);
        System.out.println("5!ACTUAL :" + actual);
        // phai tiep tuc cho cac tinh huong 6! 7! 21! -5! 0!,..
        // cac tinh huong can phair test ta goi la test case
        // ve lythuyet phai test het cac tinh huong
        // ve thux hanh: ki 5 se ro :SWT301
        System.out.println("6! :720, actual :" + MathUtility.getFactorial(6));
        System.out.println("0! :1, actual :" + MathUtility.getFactorial(0));
        // to khi vong nem ve ngoai le , phair la ngoai le 
        // illegalargumentexception neu co tinh dua vao tham so am
        System.out.println("exception: IllegalArgumentException: " + MathUtility.getFactorial(-5));
        System.out.println("hello");
    }
    
}
