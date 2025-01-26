package com.vishal.array;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input code start from here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row = sc.nextInt();
				
		System.out.println("Enter the cols : ");
		int col = sc.nextInt();
				
				
		//creating 2D array
		int arr1[][]= new int[row][col];
		int arr2[][]= new int[row][col];
		int result[][]= new int[row][col];
		
		
		System.out.println("Enter the elements of 1st matrix : ");
		for(int i=0;i<row;i++) {
		for(int j= 0;j<col;j++) {
			System.out.println(i+" , "+j);
			arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd matrix : ");
		for(int i=0;i<row;i++) {
		for(int j= 0;j<col;j++) {
			System.out.println(i+" , "+j);
			arr2[i][j]=sc.nextInt();
			}
		}
		//input code ends here
		
		//adding both matrix
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		
		//printing resulting matrix
		System.out.println("Matrix 1 : ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2 : ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Result : ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
