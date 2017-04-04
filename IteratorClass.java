import java.util.*;
import java.lang.*;
class Test implements Iterable<Integer> {    
    private String[] str=null;
    private Integer[] intgr=null;
    private final int intgrlen;
    private final int len;
    public Test(String[] s, Integer[] i){
      this.str=s;
      this.len=s.length;
      this.intgr=i;
      this.intgrlen=i.length;
    }
    @Override 
    public Iterator<Integer> iterator(){ 
      return new Iterator<Integer>() {
        int current=0;
        @Override
        public boolean hasNext(){
          if (current<intgrlen && intgr[current] != null) {
            return true;
        }else{
            return false;
        }
        }
        @Override 
        public Integer next(){
          return intgr[current++];
        }
      };
    }
}
public class IteratorClass {
  public static void main(String[] args){
    String[] s=new String[]{"AMAN", "KUMAR", "MAHATO", "Raining", "Nepal"};
    Integer[] integerValues=new Integer[]{1,2,3,4,5,6,7,8};
    Test test=new Test(s,integerValues);
    test.forEach(m->System.out.println(m));
  }
}
