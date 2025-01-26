package com.vishal.array;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array : ");
		Scanner ob = new Scanner(System.in);
		
		int size = ob.nextInt();
		
		//creating the array
		int arr[] = new int[size];
		System.out.println("Enter the elements one by one : ");
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]=ob.nextInt();
		}
		
		//find the largest of elements
		//assume karunga: arr[0] === large
		int large = arr[0];
		int largePosition=0;
		for(int l= 0; l<arr.length;l++) {
			if(arr[l]>large) {
				large=arr[l];
				largePosition=l;
			}
		}
		
		System.out.println("Largest Element : "+large);
		System.out.println("Largest Position : "+largePosition);
	}

}
