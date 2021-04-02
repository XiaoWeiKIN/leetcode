package com.xiaowei.twopoint;

/**
 * @Author: wangxw
 * @DateTime: 2021/4/2
 * @Description: 盛水最多的容器
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            res = Math.max(Math.min(height[left], height[right]) * (right - left), res);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
