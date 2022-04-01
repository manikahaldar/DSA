//Linear Search an array

import java.util.*;
class Search{
	public int searching(int arr[],int len,int element){
		for(int i=0;i<len;i++){
			if(arr[i]==element){
				return i;
			}
		}
		return -1;
	}
}

class Test8{

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of an array is:");
		int len = sc.nextInt();
		
		int arr[]=new int[100];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element which u want to serach");
		int element=sc.nextInt();
		
		Search obj = new Search();
		int result=obj.searching(arr,len,element);
		
		if(result != -1){
			System.out.println("The searching element is:"+element+" in the index of "+result);
		}
		else{
			System.out.println("The element is not found in array");
		}
	}
}