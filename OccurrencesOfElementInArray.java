package com.MainApp;

//Create a program to find number of occurrences of an element in array

import java.util.Scanner;

public class OccurrencesOfElementInArray {
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
		
		System.out.print("Enter a number you want to count: ");
		int num = sc.nextInt();
		
		int occurrences = noOfOccurrences(nums, num);
		System.out.println("Your element was found "+occurrences+" times in array");
	}
	
	
	public static int noOfOccurrences(int numArr[], int num) {
		int occ = 0;
		int i = 0;
		while(i < numArr.length) {
			if(numArr[i] == num) {
				occ++;
			}
			i++;
		}
		return occ;
	}

}
