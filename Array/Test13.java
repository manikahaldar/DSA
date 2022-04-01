//Bubble sort

import java.util.*;

class Sorting{
	public void BubbleSort(int arr[]){
	
		for(int i =0 ;i<arr.length;i++){
			for(int j = 0; j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

class Test13{
	
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
		obj.BubbleSort(arr);
		
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}