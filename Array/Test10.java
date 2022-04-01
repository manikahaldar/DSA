//Deletion using Integer minimum value
class Array{
	int arr[] = null;
	
	public Array(int size){
		arr = new int[size];
		for(int i=0; i<arr.length ;i++){
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	//Insert value
	public void insert(int location,int element){
		try{
			if(arr[location] == Integer.MIN_VALUE){
				arr[location] = element;
				System.out.println("Sccessfully Inserted");
			}
			else{
				System.out.println("The index is allready full");
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array!");
		}
	}
	//Delete value
	public void delete(int delete_value){
		try{
			arr[delete_value] = Integer.MIN_VALUE;
			System.out.println("The value is deleted");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The element is not present in array");
		}
	}
}

class Test10{
	public static void main(String args[]){
		Array obj = new Array(10);
		obj.insert(0,5);
		obj.insert(1,10);
		obj.insert(2,20);
		//obj.insert(1,30);
		//obj.insert(12,25);
		
		obj.delete(1);
		System.out.println(obj.arr[1]);
		
	}
	
}