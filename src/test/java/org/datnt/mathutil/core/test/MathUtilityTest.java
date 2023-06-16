/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.datnt.mathutil.core.test;

import org.datnt.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
//       assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
}


// TDD: TEST DRIVEN DEVELOPMENT
// - Kĩ thuật lập trình mà dân DEV viết code đến đâu thì viết bộ test case
// đến đó (JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để đảm bảo chất lượng code,
// chất lượng hàm


// HỌC KĨ THUẬT KIỂM THỬ CHO DEV - KĨ THUẬT DDT
// DATA DRIVEN TESTING:
// - Là kĩ thuật hỗ trợ cho việc Unit Test
// - Giúp các Test case dễ đọc hơn, dễ bảo trì hơn
// Phần mở rộng của TDD
// - Là KĨ THUẬT viết code kiểm thử mà tách bộ data kiểm thử 
// ra khỏi câu lệnh ASSERTEQUALS() cho dễ kiểm soát Test case

// DDT là phần mở rộng cho TDD, tức là giúp cho code test hay Unit test
// dễ dàng đọc, bảo trì, phát hiện thiếu test case

// DDT TÁCH DATA KIỂM THỬ RA 1 CHỔ RIÊNG, THƯỜNG LÀ MẢNG 2 CHIỀU
// (Có nhiều CỘT, CÁC CỘT chính là DATA đưa vào và EXPECTED)
// Và ta cần phải có nhiều dòng như thế, ứng với các TEST CASE

// Và mảng 2 chiều này FILL/ ĐỔ TỪ TỪ VÀO HÀM ASSERTEQUALS()
// Kĩ thuật tách DATA TEST Riêng ra 1 chỗ gọi là DDT
// DATA DRIVEN TESTING - VIẾT CODE TEST HƯỚNG VỀ VIẾC TÁCH DATA

// DATA ĐƯỢC ĐƯA VÀO TRỞ LẠI QUA CÁC THAM SỐ/BIẾN ĐẠI DIỆN
// NÊN DDT OCNF GỌI LÀ: PARAMETERIZED TESTING 
// THAM SỐ HÓA CÁC DATA TEST, BIẾN DATA THÀNH THAM SỐ VÀ ĐƯA VÀO HÀM ASSERTEQUALS()