/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.datnt.mathutil.core;

/**
 *
 * @author admin
 */
//c lass này clone giống class jave.util.Math
// chứa hàm static Math.sqrt(); Math.random();
public class MathUtility {

    public static final double PI = 3.1415;

    // hàm getF() là hàm tính n!= 1.2.3..n
    // thiết kế hàm như sau:
    // 0! = 1! = 1
    // ko có giai thừa cho số âm. Nếu đưa -5! -> CHỬI. ném ra Exception
    // vì giai thừa tăng rất nhanh, 21! LONG k chứa nổi (LONG 18 số 0)
    // 20! vừa đủ cho LONG
    // 21! 22! 23! > 20! -> CHỬI, ném ra Exeption
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n: n must be between 0..20");
        
        if (n == 0 || n == 1)
        return 1;
        
        long product = 1; // Biến lưu dồn các tích
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}

