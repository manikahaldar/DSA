//Insertion sort

import java.util.*;

class Sorting{
	public void InsertionSort(int arr[]){
		
		for(int i =1;i<arr.length;i++){
			int j =i-1;
			int temp = arr[i];
			
			while(j>=0 && arr[j] >temp){
				arr[j+1]=arr[j];
				j--;
			} 
			arr[j+1] = temp;
			
		}		
	}
}

class Test14{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array:");
		int len = sc.nextInt();
		
		int arr[]=new int[len];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before sorting");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAfter sorting");
		Sorting	obj = new Sorting();
		obj.InsertionSort(arr);
		
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
