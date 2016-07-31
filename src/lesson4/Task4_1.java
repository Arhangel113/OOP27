package lesson4;

import java.util.Arrays;

public class Task4_1 {

	public static void main(String[] args) {
		int [] mass = {9,8,7,6,5,4,3,2,1};
		seectSort(mass);
		System.out.println(Arrays.toString(mass));
	}


	public static void seectSort(int [] array){
		for(int j=0;j<array.length-1;j++){
			int minIndex = j;
			for(int i=j+1;i<array.length;i++){
				if(array[i]<array[minIndex]){
					minIndex = array[i];
				}
			}
			swap(array, j, minIndex);
		}
	}	

	public static void swap(int [] arr , int j, int minIndex){
		int tmp = arr[j];
		arr[j] = arr[minIndex];
		arr[minIndex] = tmp;
	} 

}
