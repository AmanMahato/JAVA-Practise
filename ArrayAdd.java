import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by amanmahato on 2/21/17.
 */
public class ArrayAdd {

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] array_1={1,2,3,4,5,6};
        int[] array_2={5,6,5,6,3,3,4,5,6,7,5};
        Integer[] testArray=new ArrayAdd().addArray(array_1,array_2);
        for(int i=0;i<testArray.length;i++){
            System.out.println(testArray[i]);
        }
    }

    public Integer[] addArray(int[] array1, int[] array2) {
        int maxLengthofArray = Math.max(array1.length, array2.length);
        int minLengthofArray = Math.min(array1.length, array2.length);
        Integer[] tempArray = new Integer[maxLengthofArray];
        Integer[] returnArray = new Integer[maxLengthofArray];
        Arrays.fill(tempArray, 0);
        int maxIndex=maxLengthofArray-1;
        int minIndex=minLengthofArray-1;
        int flag=0;
        if(array1.length>array2.length) {
            flag=1;
            for (int i = 0; i < minLengthofArray; i++) {
                tempArray[maxIndex--] = array2[minIndex--];
            }
        }else{
            flag=2;
            for (int i = 0; i < minLengthofArray; i++) {
                tempArray[maxIndex--] = array1[minIndex--];
            }
        }
        for (int i = 0; i < maxLengthofArray; i++) {
            if(flag==1){
                returnArray[i] = tempArray[i]+array1[i];
            }else{
                returnArray[i] = tempArray[i]+array2[i];
            }
        }
        return returnArray;
    }
}