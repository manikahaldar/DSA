//Array List

import java.util.ArrayList;
class ArrayListDemo{
	
	public static void main(String args[]){
		//Creating an array list
		//Default value of array list capacity =10
		ArrayList<Integer> arr = new ArrayList<>();
		
		//ArrayList<Integer> arr = new ArrayList<>(20);				-->this line represents the capacity of array list is 20
		
		//Insert value in array list
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		//Another way to insert value--> arr.add(index , vaIue) 
		arr.add(2,60);
		
		//set a vaIue in array list
		arr.set(3,59);		//->the set function is replace the value of any index
		
		//Print the size of array list
		System.out.println("Size of array list is: "+(arr.size()));
		//read the value of any index
		System.out.println("Value of index 1:"+(arr.get(3)));
		
		//print the all elements of array list
		for(int i =0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
		
	}
}