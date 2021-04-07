package com.xiaowei.word;

/**
 * @Author: wangxw
 * @DateTime: 2021/4/2
 * @Description: 反转整数
 * 123456
 * 1.如果res*10+prop>Integer.MAX
 * 2.那么一定有 res >= Integer.MAX / 10
 * 3.当res == Integer.MAX_VALUE / 10 prop>7导致溢出
 * 4.res > Integer.MAX_VALUE / 10 一定溢出
 */
public class ReverseInt {

    public int reverse(int x) {

        int res = 0;
        while (x != 0) {
            int prop = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && prop > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE && prop < -8)) {
                return 0;
            }

            res = res * 10 + prop;
            // 在这里判断已经溢出了

            x = x / 10;
        }
        return res;
    }

}
