//Fid the first Uppercase letter in astring

import java.util.*;
class Test3{
	char stringUppercase(String s){
		for(int i=0 ; s.length()>i ; i++){
			if(Character.isUpperCase(s.charAt(i))){
				return s.charAt(i);
			}
		
		}
		return 0;
	}
	public static void main(String args[]){
		Test3 obj = new Test3();

		System.out.println("First uppercase letter in string is:"+obj.stringUppercase("mAnika"));
	}
}