//Poduct and sum of an array 
import java.util.*;
class Test4{
	int productArray(int arr[],int n){
		
		if(n<=0){
			return 1;
		}
		else{
			return (productArray(arr,n-1)*arr[n-1]);
		}
	}
	
	int sumArray(int arr[],int n){
		int sum =0;
		if(n<=0){
			return 1;
		}
		else{
			for(int j=0 ; j<arr.length;j++){
				sum += arr[j];
			}
			return sum;
		}
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array is:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element of an array is:");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		
		Test4 obj= new Test4();
		System.out.println("Product of an array is: "+obj.productArray(a,size));
		System.out.println("Sum of an array is: "+obj.sumArray(a,size));
	}

}