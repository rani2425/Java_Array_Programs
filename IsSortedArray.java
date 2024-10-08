package com.MainApp;

import java.util.Scanner;

//Create a program to check if the given array is sorted or not

public class IsSortedArray {

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
		
		boolean ins = isIncreasing(nums);
		boolean dec = isDecreasing(nums);
		if(ins || dec) {
			System.out.println("Your array is sorted");
		}
		else {
			System.out.println("Your array is not sorted");
		}

	}
	
	
	
	public static boolean isIncreasing(int numArr[]) {
		int i = 1;
		while(i < numArr.length) {
			if(numArr[i] < numArr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean isDecreasing(int numArr[]) {
		int i = 1;
		while(i < numArr.length) {
			if(numArr[i] >
			numArr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}

}
