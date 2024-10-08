package com.MainApp;

//Write a program to print array element

public class ArrayTraversal {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//print array one by one 
		System.out.println("Value at index 0: "+arr[0]);
		System.out.println("Value at index 1: "+arr[1]);
		System.out.println("Value at index 2: "+arr[2]);
		System.out.println("Value at index 3: "+arr[3]);
		System.out.println("Value at index 4: "+arr[4]);
		System.out.println("Value at index 5: "+arr[5]);
		System.out.println("Value at index 6: "+arr[6]);
		System.out.println("Value at index 7: "+arr[7]);
		System.out.println("Value at index 8: "+arr[8]);
		System.out.println("Value at index 9: "+arr[9]);
		
		
		//print array using loop
		int index = 0;
		while(index < arr.length) {
			System.out.println(arr[index]);
			index++;
		}
		
	}

}
