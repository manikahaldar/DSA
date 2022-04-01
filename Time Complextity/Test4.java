//Find the runtime of the below code

class Test4{
	void method(int[] arrayA, int[] arrayB){
		for(int i = 0;i<arrayA.length;i++){							//-------------->O(a)
			for(int j =0; j<arrayB.length;j++){						//-------------->O(b)
				if(arrayA[i] <arrayB[j]){
					System.out.println("("+arrayA[i]+","+arrayB[j]+")");
				}
			}
		}
	}
	
	public static void main(String args[]){
		Test4 obj = new Test4();
		int[] arr1={1,2,3,4};
		int[] arr2={5,6,7,8};
		obj.method(arr1,arr2);
	}
}

//Time complexity: O(ab)