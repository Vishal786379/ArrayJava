package com.vishal.array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array  : ");
		int s = sc.nextInt();
		
		String arr[] = new String[s];
		
		sc.nextLine();
		for(int i = 0; i<arr.length;i++) {
			arr[i]=sc.nextLine();
			System.out.println(i);
		}
		
		//print the reverse
		System.out.println("Printing the reverse : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
	}
}
