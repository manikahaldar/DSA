//Remove consecutive duplictes in array 

import java.util.ArrayList;
class RemoveConsecutiveDuplictes{
	public static ArrayList<Integer> rcd (int arr[]){
		ArrayList<Integer> res = new ArrayList<>();
		res.add(arr[0]);
		for(int i=1; i<arr.length;i++){
			if(arr[i] != arr[i-1]){
				res.add(arr[i]);
			}
		}
		return res;
	}
	
	public static void main(String args[]){
		int arr[]={10,20,20,30,30,40,10,20};
		ArrayList<Integer> res = rcd(arr);
		for(int i=0;i<res.size();i++){
			System.out.print(res.get(i)+" ");
		}
	}
}