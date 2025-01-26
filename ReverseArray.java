package com.vishal.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//size of array
		System.out.println("Enter size of array : ");		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
				
		//creating array
		int arr1[] = new int[size];
				
		System.out.println("Enter the elements one by one : ");
				
		//input elements
		for(int i =0; i <arr1.length;i++) {
			int input = sc.nextInt();
			arr1[i]= input;
		}
		
		System.out.println(" Reverse element : ");
		//print reverse of arr1
		for(int i = arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
	}

}
