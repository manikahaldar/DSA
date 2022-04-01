//Insert an element in the array

import java.util.*;
class Insert{
	void inserting(int arr[],int len,int pos,int ele){
		for(int i= len-1; i>=(pos-1); i--){
			arr[i+1]=arr[i];
		}
		arr[pos]=ele;
		
		System.out.println("============After Inserting the Element==========");
		for(int i=0; i<=len; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

class Test7{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of an array:");
		int len=sc.nextInt();
		
		int arr[]=new int[100];
		System.out.println("Enter the element in the array:");
		for(int i=0; i<len; i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the position where u want to insert element:");
		int pos=sc.nextInt();
		
		System.out.println("Enter the element which u want to insert in the array");
		int ele = sc.nextInt();
		
		Insert obj = new Insert();
		obj.inserting(arr,len,pos,ele);
	}
}