package com.xiaowei.word;

/**
 * @Author: wangxw
 * @DateTime: 2021/3/21
 * @Description: 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = 0, max = 0;

        int[] windows = new int[128];

        for (; right < chars.length; right++) {
            char v = chars[right];
            if (windows[v] != 0) {
                left = Math.max(windows[v] + 1, left);
            }
            windows[v] = right;

            max = Math.max(right - left + 1, max);
        }

        return max;
    }
}
