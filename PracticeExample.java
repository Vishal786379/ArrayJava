package com.vishal.array;

import java.util.Scanner;

public class PracticeExample {

	public static void main(String args[]) {
		//taking input in array;
		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		
		//Create array of given size
		int arr[] = new int[size];
		
		//taking input to array
		System.out.println("Enter array element one by one  : ");
		
		for(int i = 0;i<arr.length;i++) {
			int element=sc.nextInt();
			arr[i]=element;
		}
		
		
		System.out.println("Final Array is   : ");
		//printing array elements
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
