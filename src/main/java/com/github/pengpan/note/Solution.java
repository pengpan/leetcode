package com.github.pengpan.note;

import java.util.Arrays;
import java.util.Comparator;

/**
 * LeetCode-字符跳动
 */
public class Solution {

    /**
     * 最长公共前缀
     * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1014/
     */
    public String longestCommonPrefix(String[] strs) {
        int min = Arrays.stream(strs).min(Comparator.comparing(String::length)).orElse("").length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < min; i++) {
            String[] val = new String[strs.length];
            for (int j = 0; j < strs.length; j++) {
                val[j] = String.valueOf(strs[j].charAt(i));
            }
            if (Arrays.stream(val).distinct().count() > 1) {
                break;
            }
            result.append(val[0]);
        }
        return result.toString();
    }

    /**
     * 字符串的排列
     * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1016/
     */
    public boolean checkInclusion(String s1, String s2) {
        // 子串: n(n+1)/2 + 1

        return true;
    }

    /**
     * 翻转字符串里的单词
     * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1011/
     */
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            result.append(strings[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    /**
     * 旋转字符串
     * https://leetcode-cn.com/problems/rotate-string/
     */
    public boolean rotateString(String A, String B) {
        if ("".equals(A) && "".equals(B)) return true;
        for (int i = 0, length = A.length(); i < length; i++)
            if (B.equals(A.substring(i + 1).concat(A.substring(0, i + 1)))) return true;
        return false;
    }

    /**
     * 两数之和
     * https://leetcode-cn.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
