package com.vishal.array;

import java.util.Scanner;

public class EvenPositionArray {

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
			int input = sc.nextInt();
			arr[i]= input;
		}
		
		//elements at even position
		System.out.println("Element at Even position : ");
		for(int i = 0;i<arr.length;i++) {
			//i position
			//arr[i] element
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println();
	}

}
