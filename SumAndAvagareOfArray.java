package com.MainApp;

//Create a program to find sum and avegrage of all element in array

import java.util.Scanner;

public class SumAndAvagareOfArray {

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
		
		long add = sum(nums);
		int avg = average(nums);
		System.out.println("Sum of the Element of Array: "+add);
		System.out.println("Avarage of the Element of Array: "+avg);

	}
	
	public static long sum(int[] numArray) {
		long add = 0;
		int i = 0;
		while(i < numArray.length) {
			add += numArray[i];
			i++;
		}
		return add;
	}
	
	
	public static int average(int numArray[]) {
		long avg = sum(numArray);
		return (int)(avg / numArray.length);
	}

}
