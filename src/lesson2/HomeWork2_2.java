package lesson2;

public class HomeWork2_2 {

	 public static int[] shiftArr(int[] inArr,int shift){
        if ((inArr == null)|| (inArr.length == 0 ) || (shift<=0)) { throw new java.lang.IllegalArgumentException(); }
        while(shift>0)
        {
            int lastVar = inArr[inArr.length-1];
            for(int counter = 0;counter<inArr.length;counter++)
            {
                int curVal = inArr[counter];
                inArr[counter] = lastVar;
                lastVar = curVal; 
            }
            shift--;
        }
        return inArr;
    }
    
    public static void main(String[] args)
    {
        int[] testArr = {1,2,3,4,5};
        testArr = shiftArr(testArr,2);
        
        for(int i=0; i< testArr.length; i++ )
        {
            System.out.print(testArr[i]+" ");
        }
    }

	
}
