//Reverse String using Recursion

import java.util.*;
class Test1{
	String reverse(String s){
		if(s.isEmpty()){
			return s;
		}
		else{
			return reverse(s.substring(1))+s.charAt(0);
		}
	}
	
	public static void main(String args[]){
		
		Test1 obj = new Test1();
		System.out.println("Reverse A string: "+obj.reverse("manika"));
	}
}