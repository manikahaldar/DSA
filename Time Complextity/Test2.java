//Cresate a function which prints to the console the pairs from given array
//Find the time complexity

class Test2{
	
	void printPairs(int[] array){
		for(int i =0;i<array.length;i++){			//---------------------->O(N)
			for(int j=0;j<array.length;j++){		//---------------------->O(N)
				System.out.println("("+array[i]+","+array[j]+")");		//---------------------->O(1)
			}
		}
	}
	
	public static void main(String args[]){
		Test2 obj = new Test2();
		int[] arr={1,2,3};
		obj.printPairs(arr);
		
	}
}


//Time Complexity: O(N)+O(N)+O(1)
//				  =O(N^2)+O(1)
//				  =O(N^2)
