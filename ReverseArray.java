package com.MainApp;

import java.util.Scanner;

//Create a program to reverse an array


public class ReverseArray {
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
		
		reverse(nums);
		
		System.out.println("Your reversed array is");
		DeletingFromArray.displayArray(nums);
	}
	
	
	public static void reverse(int arr[]) {
		int i = 0;
		while(i < arr.length / 2) {
			int swap = arr[i];
			arr[i] = arr[(arr.length -1) -i];
			 arr[(arr.length -1) -i] = swap;
			i++;
		}
	}

}
