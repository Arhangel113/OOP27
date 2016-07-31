package lesson4;

public class Task4_2 {

	public static void main(String[] args) {
		
		//f(0,20);
		System.out.println(sum(1,3));
	}
	
	public static void f(int count, int limit){
		System.out.println(count);
	//	System.out.println(limit-1);
		if(count == limit){
			return;
		}
		f(count+1, limit);
		System.out.println(count);
	}

	public static int  sum(int start, int end){
		//start++;
		//System.out.println(start);
		if(start == end){
			return end;
		}
		int recResult = sum(start+1,end);
		int res = start + recResult;
		return res;
		
	}


}
