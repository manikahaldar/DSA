//Covert decimal to binary using recursion
class Test4{
	int decimalToBinary(int n){
		if(n==0){
			return 0;
		}
		else{
			return (n%2 + 10*(decimalToBinary(n/2)));
		}
	}
	
	public static void main(String args[]){
		Test4 obj = new Test4();
		System.out.println("Decimal to binary : "+obj.decimalToBinary(10));
	}
}