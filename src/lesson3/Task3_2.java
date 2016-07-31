package lesson3;

import java.util.Arrays;

public class Task3_2 {

	public static void main(String[] args) {
	int [] masivchik = {9,8,7,6,5,4,3,2,1};
//	int [] sortMass = bubbleSort(masivchik);
//		for(int i=0;i<sortMass.length;i++){
//			System.out.println(sortMass[i]);
//		}			
		bubbleSort(masivchik);
		System.out.println(Arrays.toString(masivchik));

	}
	
	
	public static int [] bubbleSort(int [] array){
		int tempNum1;
		int tempNum2;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int buff = array[j+1];
					array[j+1] = array[j];
					array[j] = buff;
				}
			}
		}
	return 	array;
	}

}
