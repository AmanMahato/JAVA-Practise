/**
 * Created by amanmahato on 2/21/17.
 */
public class ConsecutiveCheck {

    public static void main(String[] args) {
        int[] testArray={1,2,3,4,9,6,7};
        if(new ConsecutiveCheck().checkConsecutive(testArray)==true){
            System.out.println("It is consecutive");
        }else{
            System.out.println("It is not consecutive");
        }
    }

    public boolean checkConsecutive(int[] inputArray){
        boolean atStart = true;
        for(int i=0;i<(inputArray.length)-1;i++){
            if(inputArray[i+1]-inputArray[i]!=1){
                atStart=false;
            }
        }
    return atStart;
    }
}
