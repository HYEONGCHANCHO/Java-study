package libraryExam02;

public class StringLibExam01 {
	public static void main(String[] args) {
		StringBuffer sb01 = new StringBuffer(20);
		System.out.println(sb01.capacity());
		sb01.append("qwertysdwdqdqdqdqeqeSqdqqadauiipajsdghhf");
		System.out.println(sb01.capacity());
		
		StringBuffer sb02 = new StringBuffer("qwqqrwegewgewgewgewgge");
		System.out.println(sb02.capacity());
		sb02.trimToSize();
		System.out.println("trimToSize 후 용량 =>"+sb02.capacity());
		System.out.println(sb02);
		System.out.println(sb02.toString());
		System.out.println(sb02.reverse());

		
		System.out.println("StringBuffer(Builder) 타입 문자열을 String type으로 변환하는 방법들");
		System.out.println(sb02+"");
		System.out.println(sb02.toString());
		System.out.println(new String(sb02));
		
		StringBuffer sb03 = new StringBuffer(new String("영구 없다"));
		StringBuffer sb04 = new StringBuffer(new StringBuilder("영구 없다"));
		
		String sourceData = "abcdefg";
		String reversData =new StringBuffer(sourceData).reverse()+"";
		System.out.println(reversData);
		System.out.println("=====================================\n");
		
		int strCnt=sourceData.length();
		StringBuffer revTarget = new StringBuffer();
		
		for(int i=0;i<strCnt; i=i+1) {
			revTarget.append(sourceData.charAt(strCnt-1-i));
			revTarget.append(sourceData.charAt(i));
		}
		System.out.println(revTarget.toString() + "\n==================");

		System.out.println("=======원자료로 복원=======");
		int revLen = revTarget.length();
		StringBuffer recData = new StringBuffer();
		
		for(int i=revLen-2; i>=0; i=i-2) {
			System.out.println(revTarget.charAt(i));
			recData.append(revTarget.charAt(i));
		}
		System.out.println();
		System.out.println(recData);
//		for(int i = strCnt-1; i >=0; i=i-2) {
//			System.out.println(sourceData.charAt(i));
//		}
//		System.out.println();
		
//		for(int i=strCnt-1;i>=0; i=i-1) {
//			System.out.println(sourceData.charAt(i));
//		}
//		System.out.println();
}
}
