//Power of number using recursion

class Test2{
	
	int powerOfNumber(int num,int p){
		
		if(p==0 || p==1){
			return num;
		}
		else{
			return num*powerOfNumber(num,p-1);
		}
	}
	
	public static void main(String args[]){
		Test2 obj = new Test2();
		System.out.println("Power of number is: "+obj.powerOfNumber(5,3));
	}
}