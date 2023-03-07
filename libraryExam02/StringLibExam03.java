package libraryExam02;

public class StringLibExam03 {
	public static void main(String[] args) {
		//int k=4; int l =4; k==l; =>true
		//String is= "aa" String js="aa" is==js ==>true
		//String is= new String("aa") String js= new String("aa") is==js ==>false  
		String is= new String("aa");
		String js= new String("aa");
		System.err.println(is + "       " + js);
		System.out.println(is==js);  

		System.out.println(is.equals(js)); //true   
		DataObj obj1 = new DataObj();
		System.out.println(obj1.aaa+ "      ,         " +obj1.bbb+",   "+ obj1.ccc);
		DataObj obj2 = new DataObj();
		obj2.ccc=32580;
		System.out.println(obj2.aaa+ "      ,         " +obj2.bbb+ ",   "+ obj2.ccc);
		System.out.println("==비교결과"+ (obj1==obj2));
		System.out.println("equals비교결과"+ (obj1.equals(obj2)));
	}
}
