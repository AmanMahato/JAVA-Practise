import java.util.*;
public class MakeStringSameLength{
	public static void main(String[] args){
		String str1="AmanMahato";
		String str2="Kumar";
		List<String> output=new MakeStringSameLength().makeSameLen(str1,str2);
		output.forEach(s->System.out.println(s));
	}

	public List<String> makeSameLen(String s1,String s2){
		int s1Len=s1.length();
		int s2Len=s2.length();
		String retunrStr=null;
		List<String> list=new ArrayList<>();
		if (s1Len>s2Len) {
			list.add(s1);
			retunrStr=new String(String.format("%"+s1Len+"s",s2).replace(" ","0"));
		}else{
			list.add(s2);
			retunrStr=new String(String.format("%"+s2Len+"s",s1).replace(" ","0"));
		}
		list.add(retunrStr);
		return list;
	}
}