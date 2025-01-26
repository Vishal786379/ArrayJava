package com.vishal.array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//size of array
		System.out.println("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
						
		//creating array
		int arr[] = new int[size];
						
		System.out.println("Enter the elements one by one : ");
						
		//input elements
		for(int i =0; i <arr.length;i++) {
			arr[i] = sc.nextInt();
//			arr[i]= input;
		}
		
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of an Array : "+sum);
	}

}
