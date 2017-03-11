public class CheckVoid{
	public static void main(String[] args){
	//int[] sample={1,2,3,4,5};
	Integer[] a=new Integer[]{22,77};
	//int[] x={9};
	//new CheckVoid().fsample(sample);
	//for(int i=0;i<sample.length-1;i++){
		//System.out.println(sample[i]);
	//}
	//new CheckVoid().addOne(a);
	System.out.println(a[0]);
	a[0]=99;
	System.out.println(a[0]);
	}

	//public void fsample(int[] array){
	//for(int i=0;i<array.length-1;i++){
//		array[i]=array[i]*3;
//	}
//	}
	public void addOne(Integer[] z){
		z[0]=z[0]+1;
		//System.out.println(z);
	}

}