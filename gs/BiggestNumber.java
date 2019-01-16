package com.sapient.gs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BiggestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 34, 3, 98, 9, 76, 45, 4,8 };
		
		
		//998764543431
		//String largestNum = largestNumber(arr);
		//System.out.println(largestNum);
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("a","a");
		map.put("a","b");
		System.out.println(map.size()+map.get("a"));

	}

	public static String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
			System.out.println(arr[i]);
		}		
				
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);	
			}
		});

		System.out.println(arr.toString());
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}

		return sb.toString();
	}
}
