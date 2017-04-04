import java.util.*;
import java.lang.*;
public class Test<String> implements Iterable<String> {
    
    private String[] str=null;
    private final int len;
    
    public Test(String[] s){
      this.str=s;
      this.len=s.length;
    }
    
    @Override 
    public Iterator<String> iterator(){
      
      return new Iterator<String>() {
        int current=0;
        
        @Override
        public boolean hasNext(){
          if (current<len && str[current] != null) {
            return true;
        }else{
            return false;
        }
        }
        @Override 
        public String next(){
          return str[current++];
        }
      
      };
    }
}

