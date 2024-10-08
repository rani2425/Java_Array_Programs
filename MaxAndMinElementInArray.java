package com.MainApp;

import java.util.Scanner;

//Create a program to find maximum and minimum element in array

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		int i = 0;
		while(i < size) {
			System.out.print("Enter element of Position " + (i+1) + ": ");
			nums[i] = sc.nextInt();
			i++;
		}
		
		
		int maxNum = max(nums);
		int minNum = min(nums);
		System.out.println("Maximun element in an array is "+maxNum);
		System.out.println("Minimum element in an array is "+minNum);

	}
	
	
	
	public static int max(int numArr[]) {
		if (numArr.length == 0) {
			return Integer.MIN_VALUE;
		}
		int max = numArr[0];
		int i = 1;
		while(i < numArr.length) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
			i++;
		}
		return max;
	}
	
	
	
	public static int min(int numArr[]) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i < numArr.length) {
			if(min > numArr[i]) {
				min = numArr[i];
			}
			i++;
		}
		return min;
	}
	
}


