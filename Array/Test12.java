//Selection sort

import java.util.*;

class Sorting{
	public void SelectionSort(int arr[]){
		
		for(int i =0;i<arr.length;i++){
			int minNo = arr[i];
			int minIndex =i;
			for(int j =i+1;j<arr.length;j++){
				if(arr[j] < minNo){
					minNo=arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i){
				
				arr[minIndex]=arr[i];
				arr[i] = minNo;
			}
		}
	}
}

class Test12{
	
	
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
		obj.SelectionSort(arr);
		
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}