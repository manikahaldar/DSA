//Binary Search

import java.util.*;
class Search{
	int searching(int arr[],int len,int element){
		
		int right=len-1, left=0;
		
		while(right>=left){
			int mid=(left+right)/2;
			
			if(arr[mid]==element){
				
				return mid;
			}
			else if(arr[mid]>element){
				right=mid-1;;
			}
			else{
				left=mid+1;
			}
		}
		return -1;
	}
}


class Test9{
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
			
			System.out.println("The searching element is:"+element+" in the position of "+result);
		}
		else{
			System.out.println("The element is not found");
		}
	}
}