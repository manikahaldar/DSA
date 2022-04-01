
import java.util.*;
class Test2{
	String palindrome(String s){
		if(s.length() == 0){
			return true;
		}
		else if(s.length() == 1){
			return s;
		}
		else if(s.charAt(0) == s.charAt(s.length()-1)){
			return palindrome(s.substring(1,s.length()-1));
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Test2 obj = new Test2();
		System.out.println("Palindrome String: "+obj.palindrome("Manika"));
	}
}