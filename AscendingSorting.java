package com.vishal.array;

import java.util.Scanner;

public class AscendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		//taking Input
		System.out.println("Enter the array of element : ");
		for(int i=0;i<arr.length;i++ ) {
			arr[i]=sc.nextInt();
		}
		//if  flag value is already false then it is sorted
		//if swap neede then value will change
		boolean flag = false;
		
		//sortng logic
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = true;
				}
			}
			if(flag==false) {
				System.out.println("Array is sorted");
				break;
			}
			
		}
		
		System.out.println("Sorted Array : ");
		for(int x : arr) {
			System.out.println(x + " ");
		}
		System.out.println();
	}
	

}
