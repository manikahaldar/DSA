//Sum of digits using recursion
class Test1{
	int sumOfDigits(int n){
		if(n==0){
			return 0;
		}
		else{
			return (n % 10 + sumOfDigits(n/10)); 
		}
	}
	
	public static void main(String args[]){
		Test1 obj = new Test1();
		System.out.println("Sum of digits is: "+obj.sumOfDigits(112));
	}
}