package com.MainApp;

import java.util.Scanner;

//Write a program to check if a number is present in array

public class SearchigInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {3, 34, 67, 89, 76, 45, 35, 21, 80, 9, 5};
		System.out.print("Enter Your Element to Search: ");
		int num = sc.nextInt();
		boolean isFound = isFound(arr, num);
			if(isFound) {
				System.out.println("Your number found in array");
			}
			else
			{
				System.out.println("Your number not found in array");
			}
		}
		
	

	
	public static boolean isFound(int arr[], int num) {
		int index = 0;
		while(index < arr.length) {
			if(arr[index] == num) {
				return true;
			}
			index++;
		}
		return false;
	}
}
