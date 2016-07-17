package lesson1;

import java.util.ArrayList;

public class Task1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] array = new int [10];
//		
//		System.out.println(array.length);
//		System.out.println(array[0]);
//		
		char dd = 'd';
		boolean ddd = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size());
		System.out.println(list);
		list.add(1, 999);
		System.out.println(list);
		list.set(2,777);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains(7));
		System.out.println(list.indexOf(2345));
		
		list.removeIf((el) -> el % 2 !=0);
//		list.removeIf((elem) ->
//		System.out.println(elem);
//		if(elem % 2 !)
		
		System.out.println(list);
		
		list.forEach((e) -> System.out.println(e));
		
		
		
		
		
	}

	public static int sum(int [] array){
		int result = 0;
		for(int i=0; i < array.length; i++){
			result += array[i];
		}
		
		return result;
	}
	
	public static void removeAllOdd(ArrayList<Integer> list){
		for(int i =0; i<list.size(); i++){
			if((list.get(i) % 2) !=0){
				list.remove(i);
				i--;
			}
		}
		
	}
	
}
