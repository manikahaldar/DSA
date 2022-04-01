//Insertion of an array

class InsertionArray{
	int arr[] = null;
	
	public InsertionArray(int size){
		arr = new int[size];
		for(int i=0; i<arr.length ;i++){
			arr[i] = Integer.MIN_VALUE;
		}
		
	}
	
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
}

class Test4{
	public static void main(String args[]){
		InsertionArray obj = new InsertionArray(10);
		obj.insert(0,5);
		obj.insert(1,10);
		obj.insert(2,20);
		obj.insert(1,30);
		obj.insert(12,25);
		
	}
	
}