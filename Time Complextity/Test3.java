//Cresate a function which prints to the console the unordered pairs from given array
//Find the time complexity

class Test3{
	
	void printUnorderedPairs(int[] array){
		for(int i =0;i<array.length;i++){			//---------------------->O(N)
			for(int j=i+1;j<array.length;j++){		//---------------------->O(N)
				System.out.println("("+array[i]+","+array[j]+")");		//---------------------->O(1)
			}
		}
	}
	
	public static void main(String args[]){
		Test3 obj = new Test3();
		int[] arr={1,2,3};
		obj.printUnorderedPairs(arr);
		
	}
}


//Time Complexity: 1.Counting Iteration:				2.Average Work:
//				  1st Iteration--->n-1					Outer loop:n times
//				  2nd Iteration--->n-2					
//					.									Inner loop:
//					.										suppose inner loop executes n times
//					1										Average loop :
//			O(N)=(n-1)+(n-2)+.....+1						Time complexity:n*n/2
//				=1+2+.....(n-1)+(n-2)										=n^2/2
//				=n(n-1)/2													=~ O(n^2)
//				=n^2/2-n/2
//Time Complexity:n^2

