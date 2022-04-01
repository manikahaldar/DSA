//Create an array using for loop taking input from user

import java.util.*;
class Test3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Taking Size of an array
		System.out.println("Enter the size of array:");
		int n= sc.nextInt();
		
		//create an array 
		int array[];
		array =new int[n];
		System.out.println("Enter the elements of an array:");
		for(int i=0; i<n ; i++){
			array[i]=sc.nextInt();
		}
		//Display the array
		System.out.println("Array elements are:");
		for(int i=0; i<array.length ; i++){
			System.out.print(array[i]+" ");
		}
	}
}