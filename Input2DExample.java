package com.vishal.array;

import java.util.Scanner;

public class Input2DExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input code start from here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter the cols : ");
		int col = sc.nextInt();
		
		
		//creating 2D array
		int arr[][]= new int[row][col];
		
		System.out.println("Enter the elements one by one : ");
		for(int i=0;i<row;i++) {
			for(int j= 0;j<col;j++) {
				System.out.println(i+" , "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		//input code ends here
		System.out.println("Matrix is : ");
		for(int i=0;i<row;i++) {
			for(int j= 0;j<col;j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
