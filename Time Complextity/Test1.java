//Create a function which calculates the sum and product of elements of an array
//Find the time complexity

import java.util.*;
class Test1{
	void sumAndProductArray(int[] array){
		int sum=0;								//-----------------------------> O(1)
		int product = 1;						//-----------------------------> O(1)
		
		for(int i =0 ;i<array.length;i++){		//-----------------------------> O(N)
			sum+=array[i];						//-----------------------------> O(1)
		}
		for(int i =0 ;i<array.length;i++){		//-----------------------------> O(N)
			product*=array[i];					//-----------------------------> O(1)
		}
		System.out.println("Sum of an array is: "+sum);			//-----------------------------> O(1)
		System.out.println("Product of an array is: "+product);				//-----------------------------> O(1)
	}
	
	public static void main(String args[]){
		Test1 obj = new Test1();
		int[] arr={1,2,3,4,5};
		obj.sumAndProductArray(arr);
		
	}
}

// Time Complexity : O(1)+O(1)+O(N)+O(1)+O(N)+O(1)+O(1)+O(1)
//					=O(1)+O(N)+O(N)+O(1)
//					=O(N)+O(N)
//					=O(N)