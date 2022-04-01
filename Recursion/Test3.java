//GCD of two number using recursion

class Test3{
	int gcd(int a,int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	
	public static void main(String args[]){
		Test3 obj = new Test3();
		System.out.println("Greatest Common Divisor of two number is: "+obj.gcd(16,8));
	}
}