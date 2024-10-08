package com.MainApp;

import java.util.Scanner;

//Create a program to check if the given array is palindrome

public class IsArrayPalindrome {

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
		
		boolean isPal = isPalindrome(nums);
		if(isPal) {
			System.out.println("Your array is palindrome");
		}
		else {
			System.out.println("Your array is  not palindrome");
		}

	}
	
	
	public static boolean isPalindrome(int arr[]){
		int i = 0;
		while(i < arr.length / 2) {
			if(arr[i] != arr[arr.length - 1 - i]) {
				return false;
			}
			i++;
		}
		return true;
	}

}
