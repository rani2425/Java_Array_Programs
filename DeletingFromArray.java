package com.MainApp;

import java.util.Scanner;

//Create a program to return a new array after deleting a specific element


public class DeletingFromArray {

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
		System.out.print("Enter number to delete: ");
		int num = sc.nextInt();
		
		int newArr[] = deleteNum(nums, num);
		System.out.println("New Array ");
		displayArray(newArr);

	}
	
	
	
	public static int[] deleteNum(int numArr[],int num) {
		int occ = OccurrencesOfElementInArray.noOfOccurrences(numArr, num);
		if(occ == 0) {
			return numArr;
		}
		int newSize = numArr.length - occ;
		int newArr[] = new int[newSize];
		
		int i = 0, j = 0;
		while(i < numArr.length) {
			if(numArr[i] != num) {
				newArr[j] = numArr[i];
				j++;
			}
			i++;
		}
		return newArr;
		
	}
	
	public static void displayArray(int numArr[]) {
		int i = 0;
		while(i < numArr.length) {
			System.out.print(numArr[i]+ " ");
			i++;
		}
	}

}
