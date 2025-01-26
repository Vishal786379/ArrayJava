package com.vishal.array;

public class ArrayExample {

	public static void main(String args[]) {
		//collection of similar type of element has contiguous memory location. 
		//collection of same type of element refer by same variable.
		//array sized is fixed
		//homogeneous element
		// zero based indexing
		//temp.length-1;
		//1 D Array :collection of same type of data arranged in linier sequence.
		//2 D array : A 2 d array is an array of 1 D arrays. It can be thought of as a table or grid of elements.
//		int arr[];//declare array;
//		arr = {12,34,56,98,100};//initialised element of array
		
//		arr = new int[6];
//		int arr[]= {12,13,34,56,78,59};
//		int marksArray[] ;//declare
		int marksArray[]= {89,90,40,77,85};
		int length = marksArray.length;
		
		System.out.println("Length of Marks array : "+length);
		
//		double marksInDecimal [];
//		marksInDecimal = new double[5];
		
		double marksInDecimal[] = new double[5];
		
		System.out.println("Marks in Decimal : "+marksInDecimal.length);
		
		System.out.println("Accenssing aray values");
		System.out.println(marksArray[1]);
		System.out.println(marksArray[3]);
		System.out.println(marksArray[0]+marksArray[3]);
		System.out.println("Accencing all array value using normal loop : ");
		
		for(int i = 0;i<=marksArray.length-1;i++) {
			System.out.println(marksArray[i]);
		}
	}
}
