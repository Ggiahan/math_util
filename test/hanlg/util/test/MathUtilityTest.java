/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanlg.util.test;

import static hanlg.util.MathUtility.*;
//ci co tu JDK 5, ham static go ma hong cantem class cham
// do minh da cho tro khai bao san ten class va ten ham static qua lenh
//import static
//sau nay xai ham static cua class nay khong can ten class chamm xai nhu C
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    // vet ra nhung tinh huogn xai ham getFactorial()
    //kiem tra xem actual == expected  hay ko??? nhuntruyen thong ben main()
    //nhung o day xin xo hon, show ra  mau XANH DO
    //ngoai ra no con dung cho viec CI: - continuous Integration
    //                               CD: - continuous Delivery
    //                               CT: - continuous regression test
    //                               DevOps: Development & Operation
// ng oai doanh nghiep dang dung
    //app lien tuc duoc kien tra chat luog code,build ra file jar, war
    // day le nmot server trugn gian, STAGING ENVIROMMENT de cho nhom test
    //san sang test ki
    //sau do day thang len productiion server, CHAY MAY THAT O NOI KHACH
    @Test // tu khoa nay tuong duong bein ham thanh public static void main()
    // tring hanm nay se show ra mau xang do dua tren su khop nhau cua 
    //EXPECTED  VS.  ACTUAL qua ham assertEquals() ... ma thu vien cung cap
    //assert...() du cac laoi assert tren cuox doi - assert (v) sosanh
    //thay vi sossanh - mat, ta nho ham so sanh gium, tra ve mau
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        assertEquals(0, getFactorial(0));
        // hay tinh gium tui 5! coi no co la 120 khong?
        // neu co thi bao mau xanh; khong thi bao do
    }

}
