package com.vishal.array;

import java.util.Scanner;

public class PracticeQuestionOne {

	public static void main(String args[]) {
		
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
		
		//creating array to copy elements
		int arr2[] = new int[arr1.length];
		
		//copy logic
		for(int i = 0; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.print("SourceArray = [ ");
		for(int i = 0; i<arr1.length;i++) {
			if(i==arr1.length-1) {
				System.out.print(arr1[i]+" ");
			}else {
				System.out.print(arr1[i]+", ");
			}
			
		}
		System.out.println("]");
		
		System.out.print("CopiedAray = [ ");
		for(int i = 0; i<arr2.length;i++) {
			if(i==arr2.length-1) {
				System.out.print(arr2[i]+" ");
			}else {
				System.out.print(arr2[i]+", ");
			}
			
		}
		System.out.println("]");
//		System.out.println("Printing Second Array : ");
//		//printing new array
//		for(int i = 0;i<arr2.length;i++) {
//			System.out.println(arr2[i]);
//		}
	}
}
