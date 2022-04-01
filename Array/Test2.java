//Create an array using for loop

class Test2{
	public static void main(String args[]){
		int array[];		//Declering an array
		array = new int[5];		//Instantiation of an aaray
		//Initialization of an array
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		
		for(int i=0; i<array.length ; i++){
			System.out.println(array[i]);
		}
	}
}