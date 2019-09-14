package com.citi.algorithm;

public class StringAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("aab"));
	}

	/*
	 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 示例 1: 输入: "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是
	 * "abc"，所以其长度为 3。
	 */

	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		char[] charArray = s.toCharArray();
		int index = 0;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = index; j < i; j++) {
				if (charArray[i] == charArray[j]) {
					index = j + 1;
					break;
				}
			}
			max = (max > (i - index + 1) ? max : i - index + 1);
		}

		return max;
	}

}
