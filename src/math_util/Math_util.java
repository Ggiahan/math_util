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
        System.out.println("RED OR GREEN");
    }
    
}
// minh muon ket luan ham tot phia test het cac truong hop
// truong hop = 5! 0! -5! 21! 20!,..
// minh phair thiet ke cac test case, tinh huong test de sau do minh verify
//han chay phai tra ve
// va neu moi thu khop, tuc la actual==expected, minh moi dam ket luan ham chay tot
// cacsh nay co nguoc diem : phair nhin bang mat va so sanh ket qua cua tung case tinh huog
//cach nay on nhung tiem an sai sot do nhin = mat nhieu case
//CACH NANG CAO
//cung nhin bang mat , nhung chi nhin 2 mau XANH- DO cho moi test case
// co nghia khi ban xai ham cho 100 tham so, chay ham 100 tinh huog khac nhau
//ban chi can nhin duy nhat 2 mau xanh, do
//XANH: code on cho moi test case ; moi case phaii co actual== expected thi moi xanh
// DO: moi case mau xanh, nhung chi co it nhat 1 thang do thif ket luan moi thang deu do
//ham dung cho 99 truong hop nhung 1 truong hop sai--> ham khong on dinh
//phai chinh xac voi moi thu moi duoc ket luan oon dinh cho moi truong hop
//CHI CAN IT NHAT MOT CAI KHONG ON DINH, DOR CA DAM DE DAM BAO HAM PHAIH CHINH XAC MOI TINH HUONG
//UON LAM DUOC DIEU NAY PHIA PHU THUOC 
