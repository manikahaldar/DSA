//Insertion of an array

class InsertionArray{
	public void insertElement(int arr[],int element, int size, int index, int capacity){
		try{
			for(int i = size; i>=index ; i--){
				arr[i+1]=arr[i];
			}		
			arr[index]=element;
			System.out.println("\n----------Insertion array------------\n");
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index");
		}
	}
}
class Test5{
	public static void main(String args[]){ 
		int arr[]= new int[7];
		arr[0] = 14;
		arr[1] = 10;
		arr[2] = 25;
		arr[3] = 68;
		arr[4] = 58;
		arr[5] = 96;
		int size=4, element=1, index=2;
		System.out.println("-----------Orijinal Array------------\n");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		InsertionArray obj = new InsertionArray();
		obj.insertElement(arr,element,size,index,10);
		size+=1;
	}
	
}