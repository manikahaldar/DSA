//Inserting an element taking input from user

import java.util.*;
class Insert{
	void inserting(int arr[],int length,int position,int element){
		
		for(int i=length-1; i>= (position-1); i--){
			arr[i+1] = arr[i];
		}
		
		//arr[position-1]=element;
		arr[position]=element;			//Index Wise
		
		System.out.println("============After Inserting an Element===========");
		
		for(int i=0; i<=length ; i++){
			System.out.println(arr[i]+" ");
		}
	
	}
}

class Test6{
	public static void main(String args[]){
		int arr[]=new int[100];
		int length,position,element;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of an array:");
		length = sc.nextInt();
		
		System.out.println("Enter the element in the array:");
		for(int i = 0; i<length; i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the position where u want to insert the element:");
		position=sc.nextInt();
		
		System.out.println("Enter the element which u want to insert in the array:");
		element=sc.nextInt();
		
		Insert obj = new Insert();
		obj.inserting(arr,length,position,element);
	}
}