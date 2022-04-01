//Delete array element

import java.util.*;
class Delete{
	int deleting(int arr[],int len,int delete_element){
		for(int i=0;i<len-1;i++){
			if(arr[i]!=delete_element){
				continue;
			}
			else{
				for(int j =i;j<len-1;j++){
					arr[j]=0;
				}
				return 1;
			}
			
		}
		return -1;
		
	}
}


class Test11{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of an array is:");
		int len = sc.nextInt();
		
		int arr[]=new int[len];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element which u want to delete");
		int element=sc.nextInt();
		
		Delete obj = new Delete();
		int result=obj.deleting(arr,len,element);
		
		if(result == -1){
			System.out.println("The element is not found in the array");
			
		}
		else{
			System.out.println("The number : "+element+" is deleted");
			System.out.println("=============After deleting the element============");
			for(int i=0;i<len ;i++){
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
	}
}