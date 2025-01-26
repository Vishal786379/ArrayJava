package com.vishal.array;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 D Array: A 2D array
		//we know values:
		int arr[][]= {{4,9,10},{6,8,5},{2,3,1},{11,8,2}};
		
//		System.out.println(arr[2][1]);
		
		for(int i =0; i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[0].length-1;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 2nd way of creating 2d array
		System.out.println("Second way of writing array");
		int arr1[][]=new int [4][4];
		for(int i =0; i<=arr1.length-1;i++) {
			for(int j = 0;j<=arr1[0].length-1;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
